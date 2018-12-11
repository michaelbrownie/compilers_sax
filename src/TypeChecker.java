import models.Type;

public class TypeChecker extends JavaBlyatBaseVisitor {

    public TypeChecker() {

    }

    @Override
    public Object visitNew_variable(JavaBlyatParser.New_variableContext ctx) {
        Type type = Type.getType(ctx.DATATYPES().getText());
        if (type == Type.INVALID)  {
            throw new RuntimeException("Variable " + ctx.ID().getText() + " has a incorrect type");
        } else if(visit(ctx.calc_expression()) != type) {
            throw new RuntimeException("Variable " + ctx.ID().getText() + " has a incorrect value");
        }
        return super.visitNew_variable(ctx);
    }

    @Override
    public Object visitNew_variable_declaration(JavaBlyatParser.New_variable_declarationContext ctx) {
        Type type = Type.getType(ctx.DATATYPES().getText());
        if (type == Type.INVALID) {
            throw new RuntimeException("Variable " + ctx.ID().getText() + " has a incorrect type");
        }
        return super.visitNew_variable_declaration(ctx);
    }

    @Override
    public Object visitLiteralString(JavaBlyatParser.LiteralStringContext ctx) {
        return Type.STRING;
    }

    @Override
    public Object visitLiteralInt(JavaBlyatParser.LiteralIntContext ctx) {
        return Type.INT;
    }

    @Override
    public Object visitLiteralBoolean(JavaBlyatParser.LiteralBooleanContext ctx) {
        return Type.BOOL;
    }
}
