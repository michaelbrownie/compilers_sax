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

    public Scope(String title){
        this.title = title;
        this.pos = 0;
        this.stackSize = 0;
        this.variableMap = new HashMap<>();
        this.childList = new ArrayList<>();
    }

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

    public Scope createChildScope(String name){
        return new Scope(this,name);
    }

    public boolean addVariableToScope(Symbol variable){
        Symbol symbol = this.searchVariable(variable.getName());
        if(symbol == null){
            this.variableMap.put(variable.getName(), variable);
            return true;
        }
        return false;
    }

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

    public int countMaxStack() {
        int stackSize = this.stackSize;
        for(Scope s: this.childList){
            stackSize += s.stackSize;
        }
        return stackSize;
    }

    public int countLocals() {
        int aantal = this.variableMap.size();
        for(Scope s: this.childList){
           aantal += s.variableMap.size();
        }
        return aantal;
    }

    public void increaseStack(){
        this.stackSize++;
    }

    public boolean addChild(Scope s){
        return this.childList.add(s);
    }

    public Scope closeChildScope(){
        return this.parent;
    }

    public void setPosOnSymbol(Symbol symbol) {
        symbol.setPos(this.pos++);
    }

    public Scope getParent() {
        return this.parent;
    }
}
