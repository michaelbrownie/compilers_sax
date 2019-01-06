package models;

import java.util.ArrayList;
import java.util.HashMap;

public class Scope {
    private String title;
    private int stackSize;
    private int pos;
    private Scope parent;
    private HashMap<String, Symbol> variableMap;
    private ArrayList<Scope> childList;

    /**
     * Scope constructor
     * @param title The name of the scope
     */
    public Scope(String title){
        this.title = title;
        this.pos = 0;
        this.stackSize = 0;
        this.variableMap = new HashMap<>();
        this.childList = new ArrayList<>();
    }

    /**
     * Scope constructor
     * @param parent The parent scope
     * @param title The name of the scope
     */
    public Scope(Scope parent, String title) {
        this.parent = parent;
        this.title = title;
        if(parent == null) {
            this.pos = 0;
            this.stackSize = 0;
        } else {
            this.pos = parent.pos;
            this.stackSize = parent.stackSize;
        }
        this.variableMap = new HashMap<>();
        this.childList = new ArrayList<>();
    }

    /**
     * Creates a childscope
     * @param name The name of the childscope
     * @return The childscope
     */
    public Scope createChildScope(String name){
        return new Scope(this,name);
    }

    /**
     * Adds a variable to the current scope
     * @param variable The new variable
     * @return
     */
    public boolean addVariableToScope(Symbol variable){
        Symbol symbol = this.searchVariable(variable.getName());
        if(symbol == null){
            this.variableMap.put(variable.getName(), variable);
            return true;
        }
        return false;
    }

    /**
     * Search for a variable in the current scope
     * @param title The title of the variable
     * @return The symbol(variable) in the variable map
     */
    public Symbol searchVariable(String title){
        if(this.parent != null){
            if(this.variableMap.get(title) != null){
                return this.variableMap.get(title);
            } else {
                return this.parent.searchVariable(title);
            }
        } else {
            return this.variableMap.get(title);
        }
    }

    /**
     * Counts all the variables in the program
     * @return maxLocals
     */
    public int countLocals(){
        int maxLocal = this.variableMap.size();
        int temp = 0;
        for (Scope scope : this.childList) {
            temp = scope.countLocals();
            if (temp > maxLocal) {
                maxLocal = temp;
            }
        }
        return maxLocal + this.childList.size();
    }

    /**
     * Counts the max stack size of the program
     * @return maxStackSize
     */
    public int countMaxStack() {
        int maxStack = this.stackSize;
        int temp = 0;
        for(Scope s: this.childList){
           temp = s.countMaxStack();
           if(temp > maxStack){
               maxStack = temp;
           }
        }
        return stackSize;
    }

    /**
     * Increases the stacksize of the current scope
     */
    public void increaseStack(){
        this.stackSize++;
    }

    /**
     * Add a new scope child to the child list
     * @param s child scope
     * @return currentChildList
     */
    public boolean addChild(Scope s){
        return this.childList.add(s);
    }

    /**
     * Closes the current child scope
     * @return the parent scope
     */
    public Scope closeChildScope(){
        return this.parent;
    }

    /**
     * Sets a position on a symbol(Variable) in a scope
     * @param symbol the new symbol(Variable)
     */
    public void setPosOnSymbol(Symbol symbol) {
        symbol.setPos(this.pos++);
    }

    /**
     * Gets all the childscopes
     * @return all child scopes
     */
    public ArrayList<Scope> getChildList() {
        return childList;
    }

    /**
     * Get the parent scope
     * @return the parent scope
     */
    public Scope getParent() {
        return this.parent;
    }

    /**
     * Gets the title of the scope
     * @return the title of the scope
     */
    public String getTitle() {
        return title;
    }
}
