import models.Scope;
import models.Symbol;
import models.Type;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CodeGen extends JavaBlyatBaseVisitor {

    private String fileName;

    private Scope scope;

    private ParseTreeProperty scopeTree;
    private ParseTreeProperty variableTree;
    private ParseTreeProperty valueExpressionTree;

    private PrintWriter printWriter;

    private Symbol lastCalcSymbol;

    public CodeGen (String fileName, Scope scope, ParseTreeProperty scopeTree, ParseTreeProperty variableTree, ParseTreeProperty valueExpressionTree) throws FileNotFoundException, UnsupportedEncodingException {
        this.fileName = fileName;
        this.scope = scope;
        this.scopeTree = scopeTree;
        this.variableTree = variableTree;
        this.valueExpressionTree = valueExpressionTree;
        this.printWriter = new PrintWriter(fileName + ".j", "UTF-8");
        this.printWriter.println(".class public " + this.fileName + "\n" + // Name and access modifier of the class
                                 ".super java/lang/Object\n" + // ; Inheritance definition
                                 "\n" +
                                 ".method public <init>()V\n" +
                                 "\taload_0\n" + //Loads "this" on the stack
                                 "\tinvokenonvirtual java/lang/Object/<init>()V\n" + //Call super constructor
                                 "\treturn\n" + // Terminate method
                                 ".end method\n");
    }

    @Override
    public Object visitProgram(JavaBlyatParser.ProgramContext ctx) {
        printWriter.println(".method public static main([Ljava/lang/String;)V");
        printWriter.println("\t.limit stack " + (this.scope.countMaxStack() + 1) + "\n"); //Size of the operand stack
        visitChildren(ctx);
        printWriter.println("\treturn\n" + // Terminate method
                ".end method");
        return null;
    }

    @Override
    public Object visitPrintString(JavaBlyatParser.PrintStringContext ctx) {
        printWriter.println("\tgetstatic java/lang/System/out Ljava/io/PrintStream;"); // Get printstream
        printWriter.println("\tldc "+ ctx.STRING().getText()); // Push string to stack
        printWriter.println("\tinvokevirtual java/io/PrintStream/println(Ljava/lang/String;)V" + "\n"); //Pop last from stack and print line
        return null;
    }

    @Override
    public Object visitPrintCalcExpression(JavaBlyatParser.PrintCalcExpressionContext ctx) {
        printWriter.println("\tgetstatic java/lang/System/out Ljava/io/PrintStream;"); // Get printstream
        visit(ctx.calc_expression());
        printWriter.println("\tinvokevirtual java/io/PrintStream/println(I)V"); // Print last index of stack
        return null;
    }

    @Override
    public Object visitCalcValueExpression(JavaBlyatParser.CalcValueExpressionContext ctx) {
        return super.visitCalcValueExpression(ctx);
    }

    @Override
    public Object visitLiteralString(JavaBlyatParser.LiteralStringContext ctx) {
        printWriter.println("\tldc " + ctx.STRING().getText()); // ldc pushes a one-word constant onto the operand stack. STRING/INT/FLOAT
        return Type.STRING;
    }

    @Override
    public Object visitLiteralInt(JavaBlyatParser.LiteralIntContext ctx) {
        Integer integer = new Integer(ctx.INT().getText());
        if(integer >= 0 && integer <= 127){
            printWriter.println("\tbipush " + integer);// <n> is an integer >= -128 and <= 127 that is pushed onto the stack.
        } else if(integer >= 128 && integer < 32767){
            printWriter.println("\tsipush " + integer);// <n> is a signed integer in the range -32768 to 32767.
        } else {
            printWriter.println("\tldc " + integer);
        }
        return Type.INT;
    }

    @Override
    public Object visitLiteralBoolean(JavaBlyatParser.LiteralBooleanContext ctx) {
        if(ctx.BOOLEAN().getText().equals("trueblyat")){
            printWriter.println("\ticonst_1"); // iconst_<n> represents the series of opcodes iconst_0, iconst_1,
        } else {
            printWriter.println("\ticonst_0"); // iconst_<n> represents the series of opcodes iconst_0, iconst_1,
        }
        return Type.BOOL;
    }

    @Override
    public Object visitLiteralId(JavaBlyatParser.LiteralIdContext ctx) {
        return super.visitLiteralId(ctx);
    }

    public PrintWriter getPrintWriter() {
        return printWriter;
    }
}
