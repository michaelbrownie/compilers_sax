package models;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Scope {
    private String name;
    private int stackSize;
    private int pos;
    private Scope parent;
    private LinkedHashMap<String, Symbol> variableMap;
    private ArrayList<Scope> childList;

    public Scope(Scope parent, String name) {
        this.parent = parent;
        this.name = name;
        if(parent == null) {
            this.pos = 0;
            this.stackSize = 0;
        } else {
            this.pos = parent.pos;
            this.stackSize = parent.stackSize;
        }
        this.variableMap = new LinkedHashMap<>();
        this.childList = new ArrayList<>();
    }

    public Scope(Scope parent, String name, int stackSize) {
        this.parent = parent;
        this.name = name;
        if(parent == null) {
            this.pos = 0;
        } else {
            this.pos = parent.pos;
        }
        this.stackSize = stackSize;
        this.variableMap = new LinkedHashMap<>();
        this.childList = new ArrayList<>();
    }

    public Scope createChildScope(String name, int stackSize){
        return new Scope(this, name, stackSize);
    }

    public Scope createChildScope(String name){
        return new Scope(this,name);
    }

    public boolean addVariableToScope(Symbol variable){
        Symbol symbol = this.checkVariableByName(variable.getName());
        if(symbol == null){
            this.variableMap.put(variable.getName(), variable);
            return true;
        }
        return false;
    }

    public Symbol checkVariableByName(String name){
        if(parent != null){
            if(this.variableMap.get(name) != null){
                return this.variableMap.get(name);
            } else {
                return this.parent.checkVariableByName(name);
            }
        } else {
            return this.variableMap.get(name);
        }
    }

    public void increaseStack(){
        this.stackSize++;
    }

    public boolean addChild(Scope s){
        return this.childList.add(s);
    }

    public Scope closeChildScope(){
        return parent;
    }

    public void setPosOnSymbol(Symbol symbol) {
        symbol.setPos(pos++);
    }


}
