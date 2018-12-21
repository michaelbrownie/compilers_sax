import models.Scope;
import models.Symbol;
import models.Type;
import models.Value;
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
    private Value lastvalExpression;

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
        printWriter.println("\t.limit stack " + (this.scope.countMaxStack() + 1)); //Size of the operand stack
        printWriter.println("\t.limit locals " + this.scope.countLocals() + "\n"); //Size of the operand stack
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
    public Object visitPrintId(JavaBlyatParser.PrintIdContext ctx) {
        Scope s = (Scope) scopeTree.get(ctx);
        Symbol symbol = s.searchVariable(ctx.ID().getText());
        printWriter.println("\tgetstatic java/lang/System/out Ljava/io/PrintStream;"); // Get printstream
        this.getVariable(symbol.getType(), symbol.getPos());
        switch (symbol.getType()){
            case INT:
                printWriter.println("\tinvokevirtual java/io/PrintStream/println(I)V"); // Print last index of stack
                break;
            case STRING:
                printWriter.println("\tinvokevirtual java/io/PrintStream/println(Ljava/lang/String;)V"); // Print last string from stack
                break;
            case BOOL:
                printWriter.println("\tinvokevirtual java/io/PrintStream/println(Z)V");
                break;
        }
        return super.visitPrintId(ctx);
    }

    @Override
    public Object visitCalcValueExpression(JavaBlyatParser.CalcValueExpressionContext ctx) {
        this.lastvalExpression = (Value) valueExpressionTree.get(ctx);
        visitChildren(ctx);
        String operator = ctx.operator.getText();
        switch (operator){
            case "*":
                printWriter.println("\timul"); // Pops the top two integers from the operand stack, multiplies them, and pushes the integer result back onto the stack.
                break;
            case "/":
                printWriter.println("\tidiv"); // Pops the top two integers from the operand stack and divides the second-from top integer (value2) by the top integer (value1), i.e. computes (value2 div value1).
                break;
            case "-":
                printWriter.println("\tisub"); // Pops two ints off the operand stack, subtracts the top one from the second (i.e. computes value2 - value1),
                break;
            case "+":
                printWriter.println("\tiadd"); // Pops two integers from the operand stack, adds them, and pushes the integer result back onto the stack.
                break;
        }
        return null;
    }

    @Override
    public Object visitNew_variable(JavaBlyatParser.New_variableContext ctx) {
        Symbol s = (Symbol) variableTree.get(ctx);
        visit(ctx.calc_expression());
        int pos = s.getPos();
        System.out.println(pos);
        this.storeVariable(s.getType(),pos);
        return null;
    }

    private void storeVariable(Type type, int pos){
        switch (type){
            case INT:
                printWriter.println("\tistore " + pos); // Pops an in off the stack and stores it in local variable <varnum>.
                break;
            case STRING:
                printWriter.println("\tastore " + pos); // Pops objectref (a reference to an object or array) off the stack and stores it in local variable <varnum>.
                break;
            case BOOL:
                printWriter.println("\tistore " + pos); // Pops an in off the stack and stores it in local variable <varnum>.
                break;
        }
    }

    private void getVariable(Type type, int pos){
        switch (type){
            case INT:
                printWriter.println("\tiload " + pos); // Pushes the int value held in a local variable onto the operand stack. The iload instruction takes a single parameter, <varnum>, an unsigned integer which indicates which local variable to use.
                break;
            case STRING:
                printWriter.println("\taload " + pos); // Retrieves an object reference from a local variable and pushes it onto the operand stack.
                break;
            case BOOL:
                printWriter.println("\tiload " + pos); // Pushes the int value held in a local variable onto the operand stack. The iload instruction takes a single parameter, <varnum>, an unsigned integer which indicates which local variable to use.
                break;
        }
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
