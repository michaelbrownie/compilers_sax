package models;

public enum Type {
    STRING,
    INT,
    BOOL,
    PARENTHESES,
    INVALID,
    ID;

    /**
     * Gets the type of a datatype in the cykablyat language
     * @param datatype The cykablyat datatype
     * @return Java datatype
     */
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
