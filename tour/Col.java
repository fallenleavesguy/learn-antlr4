import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Col {
  public static void main(String[] args) throws Exception {
    CharStream input = CharStreams.fromStream(System.in);
    RowsLexer lexer = new RowsLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    int col = Integer.valueOf(args[0]);
    RowsParser parser = new RowsParser(tokens, col);
    parser.setBuildParseTree(false);
    parser.file();
  }
}
