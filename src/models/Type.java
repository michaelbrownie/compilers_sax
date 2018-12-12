package models;

public enum Type {
    STRING,
    INT,
    BOOL,
    INVALID;

    public static Type getType(String datatype) {
        switch (datatype) {
            case "stringblyat":
                return Type.STRING;
            case "intblyat":
                return Type.INT;
            case "booleanblyat":
                return Type.BOOL;
            default:
                return Type.INVALID;
        }
    }
}
