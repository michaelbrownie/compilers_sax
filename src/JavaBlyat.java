import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


import java.io.IOException;
import java.util.ArrayList;

public class JavaBlyat {

    private static void evaluate( String file ) throws IOException {
        ANTLRInputStream antlrInputStream = new ANTLRFileStream(file);

        //Lexer & TokenStream
        JavaBlyatLexer javaBlyatLexer = new JavaBlyatLexer(antlrInputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(javaBlyatLexer);

        //ParseTree
        JavaBlyatParser javaBlyatParser = new JavaBlyatParser(commonTokenStream);
        ParseTree tree = javaBlyatParser.program();

        //TypeChecker
        TypeChecker typeChecker = new TypeChecker();
        typeChecker.visit(tree);

        //ScopeChecker
        ScopeChecker scopeChecker = new ScopeChecker();
        scopeChecker.visit(tree);

        //Get filename without extension
        String fileName = file.substring(0, file.length() - 3);

        //CodeGenerator
        CodeGen codeGen = new CodeGen(fileName, scopeChecker.getScope(), scopeChecker.getScopeTree(), scopeChecker.getVariableTree());
        codeGen.visit(tree);
        codeGen.getPrintWriter().flush();
        codeGen.getPrintWriter().close();

        //Jasmin part
        String jasminFile = fileName + ".j";
        ArrayList<String> cmd = new ArrayList<>();
        cmd.add("java");
        cmd.add("-jar");
        cmd.add("jasmin.jar");
        cmd.add("-g");
        cmd.add(jasminFile);
        ProcessBuilder pb = new ProcessBuilder(cmd);
        pb.start();
    }


    public static void main(String[] args) throws IOException {
        evaluate("test.JB");
    }
}
