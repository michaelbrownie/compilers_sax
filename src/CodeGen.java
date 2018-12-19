import models.Scope;
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

    public CodeGen (String fileName, Scope scope, ParseTreeProperty scopeTree, ParseTreeProperty variableTree, ParseTreeProperty valueExpressionTree) throws FileNotFoundException, UnsupportedEncodingException {
        this.fileName = fileName;
        this.scope = scope;
        this.scopeTree = scopeTree;
        this.variableTree = variableTree;
        this.valueExpressionTree = valueExpressionTree;
        this.printWriter = new PrintWriter(fileName + ".j", "UTF-8");
        this.printWriter.println(".class public " + this.fileName + "\n" +
                ".super java/lang/Object\n" +
                "\n" +
                "; standard initializer (calls java.lang.Object's initializer)\n" +
                ".method public <init>()V\n" +
                "\taload_0\n" +
                "\tinvokenonvirtual java/lang/Object/<init>()V\n" +
                "\treturn\n" +
                ".end method\n");
    }

    @Override
    public Object visitProgram(JavaBlyatParser.ProgramContext ctx) {
        printWriter.println("; main() method");
        printWriter.println(".method public static main([Ljava/lang/String;)V");
        printWriter.println("\t.limit stack " + this.scope.countMaxStack());
        printWriter.println("\t.limit locals " + this.scope.countLocals());
        visitChildren(ctx);
        printWriter.println("\treturn\n" +
                ".end method");
        return super.visitProgram(ctx);
    }

    public PrintWriter getPrintWriter() {
        return printWriter;
    }
}
