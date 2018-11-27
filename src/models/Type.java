package models;

public enum Type {
    STRING,
    INT,
    BOOL,
    VOID,
    INVALID;

    public static Type getType(String datatype) {
        switch (datatype) {
            case "stringblyat":
                return Type.STRING;
            case "intblyat":
                return Type.INT;
            case "booleanblyat":
                return Type.BOOL;
            case "voidblyat":
                return Type.VOID;
            default:
                return Type.INVALID;
        }
    }
}
