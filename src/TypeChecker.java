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
    public Object visitCompareExpressions(JavaBlyatParser.CompareExpressionsContext ctx) {
        Type left = (Type) visit(ctx.leftExpression);
        Type right = (Type) visit(ctx.rightExpression);
        if(this.compare(left, right)){
            return Type.BOOL;
        }
        throw new RuntimeException("You can't compare an " + left.toString() + " with " + right.toString());
    }

    @Override
    public Object visitEqualExpressions(JavaBlyatParser.EqualExpressionsContext ctx) {
        Type left = (Type) visit(ctx.leftExpression);
        Type right = (Type) visit(ctx.rightExpression);
        if(this.compare(left, right)){
            return Type.BOOL;
        }
        throw new RuntimeException("You can't compare an " + left.toString() + " with " + right.toString());
    }

    @Override
    public Object visitCalcValueExpression(JavaBlyatParser.CalcValueExpressionContext ctx) {
        if(ctx.operator.getText().equals("+") || ctx.operator.getText().equals("-") || ctx.operator.getText().equals("*") || ctx.operator.getText().equals("/")){
            if (visit(ctx.leftExpression) == Type.INT && visit(ctx.rightExpression) == Type.INT) {
                return Type.INT;
            } else {
                throw new RuntimeException("You cant use the operator "+ ctx.operator.getText() + " with " + visit(ctx.leftExpression) + " and " + visit(ctx.rightExpression));
            }
        }
        return null;
    }

    private boolean compare(Type left, Type right){
        if(left == Type.INT && right == Type.INT || left == Type.BOOL && right == Type.BOOL){
            return true;
        }
        return false;
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
