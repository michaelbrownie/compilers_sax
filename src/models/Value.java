package models;

public class Value {
    private Type exprType;

    public Value(Type exprType) {
        this.exprType = exprType;
    }

    public Type getExprType() {
        return exprType;
    }
}
