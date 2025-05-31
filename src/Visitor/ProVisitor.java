package Visitor;

import AST.Program;
import AST.ProgramAll;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;


public class ProVisitor extends AngularParserBaseVisitor<Program> {

    private ProgramVisitor programVisitor = new ProgramVisitor();

    public ProgramVisitor getProgramVisitor() {
        return programVisitor;
    }

    @Override
    public Program visitProgram(AngularParser.ProgramContext ctx) {
        List<ProgramAll> list = new ArrayList<>();
//        ProgramVisitor programVisitor = new ProgramVisitor();
        for (int i = 0; i < ctx.all().size(); i++) {
            list.add(programVisitor.visit(ctx.all(i)));
        }
        return new Program(list);
    }
}
