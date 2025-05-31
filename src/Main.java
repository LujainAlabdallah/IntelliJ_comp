import AST.Program;
import Visitor.ProVisitor;
import Visitor.ProgramVisitor;
import antlr.AngularLexer;
import antlr.AngularParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) {
        try {
            String path = "C://Users//muzaic//Desktop//comp//src//test//test.txt";
            CharStream input = fromFileName(path);
            AngularLexer lexer = new AngularLexer(input);
            CommonTokenStream token = new CommonTokenStream(lexer);
            AngularParser parser = new AngularParser(token);
            ParseTree tree = parser.program();
            ProVisitor ProVisitor = new ProVisitor();
            Program program = ProVisitor.visit(tree);
            System.out.println(program);
            ProVisitor.getProgramVisitor().getSymbolTable().print();
        } catch (IOException e) {
            e.printStackTrace();
        }
}}