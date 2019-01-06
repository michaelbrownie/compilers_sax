package models;

public class Symbol {
    private String name;
    private Type type;
    private int pos;

    /**
     * The constructor of a symbol
     * @param name The name of the symbol
     * @param type The type of the symbol
     */
    public Symbol(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Gets the name of a symbol
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the type of a symbol
     * @return The type
     */
    public Type getType() {
        return type;
    }

    /**
     * Gets the position of a symbol
     * @return The position
     */
    public int getPos() {
        return pos;
    }

    /**
     * Sets the position of a symbol
     * @param pos The position
     */
    public void setPos(int pos) {
        this.pos = pos;
    }
}
