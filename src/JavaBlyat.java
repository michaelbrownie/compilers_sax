import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class JavaBlyat {

    public static void main(String[] args) throws IOException {
        ANTLRInputStream antlrInputStream = new ANTLRFileStream("test");
        JavaBlyatLexer javaBlyatLexer = new JavaBlyatLexer(antlrInputStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(javaBlyatLexer);

        JavaBlyatParser javaBlyatParser = new JavaBlyatParser(commonTokenStream);
    }

}
