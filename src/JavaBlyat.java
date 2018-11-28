import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


import java.io.IOException;

public class JavaBlyat {

    private static void evaluate( String file ) throws IOException {
        ANTLRInputStream antlrInputStream = new ANTLRFileStream(file);

        JavaBlyatLexer javaBlyatLexer = new JavaBlyatLexer(antlrInputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(javaBlyatLexer);

        JavaBlyatParser javaBlyatParser = new JavaBlyatParser(commonTokenStream);
        ParseTree tree = javaBlyatParser.parse();

        //TypeChecker
        TypeChecker typeChecker = new TypeChecker();
        typeChecker.visit(tree);

        //ScopeChecker

    }


    public static void main(String[] args) throws IOException {
        evaluate("test.JB");
    }
}
