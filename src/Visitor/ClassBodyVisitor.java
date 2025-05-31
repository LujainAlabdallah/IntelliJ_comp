//package Visitor;
//
//import AST.ClassBody;
//import AST.CLASSMEMBER1;
//import AST.classMember;
//import antlr.AngularParser;
//import antlr.AngularParserBaseVisitor;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ClassBodyVisitor extends AngularParserBaseVisitor<ClassBody> {
//
//    @Override
//    public ClassBody visitCLASSMEMBER1(AngularParser.CLASSMEMBER1Context ctx) {
//        ClassMemberVisitor classMemberVisitor=new ClassMemberVisitor();
//        List<classMember> CLASSMEMBER1s = new ArrayList<>();
//        for(int i = 0 ; i < ctx.classMember().size();i++){
//            CLASSMEMBER1s.add(classMemberVisitor.visit(ctx.classMember().get(i)));
//        }
//        return (ClassBody) CLASSMEMBER1s;
//    }
//
//    @Override
//    public ClassBody visitClassmem(AngularParser.ClassmemContext ctx) {
//        return super.visitClassmem(ctx);
//    }
//
//    @Override
//    public ClassBody visitCLASSMEM1(AngularParser.CLASSMEM1Context ctx) {
//        return visit(ctx.classmem());
//    }
//}
