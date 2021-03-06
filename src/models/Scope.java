package models;

import java.util.ArrayList;
import java.util.HashMap;

public class Scope {
    private String title;
    private int stackSize;
    private int pos;
    private Scope parent;
    private HashMap<String, Symbol> variableMap;
    private HashMap<String, FunctionScope> functionMap;

    private ArrayList<Scope> childList;

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
        this.functionMap = new HashMap<>();
        this.childList = new ArrayList<>();
    }

    public Scope(Scope parent, String title, int stackSize) {
        this.parent = parent;
        this.title = title;
        if(parent == null) {
            this.pos = 0;
        } else {
            this.pos = parent.pos;
        }
        this.stackSize = stackSize;
        this.variableMap = new HashMap<>();
        this.functionMap = new HashMap<>();
        this.childList = new ArrayList<>();
    }

    public Scope createChildScope(String name, int stackSize){
        return new Scope(this, name, stackSize);
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

    public boolean addFunctionToScope(Function function){
        FunctionScope fs = this.searchFunction(function.getTitle());
        if(fs == null){
            FunctionScope functionScope = new FunctionScope(this, function.getTitle(), function);
            this.functionMap.put(function.getTitle(), functionScope);
            this.childList.add(functionScope);
            return true;
        }
        return false;
    }

    public Symbol searchVariable(String title){
        if(parent != null){
            if(this.variableMap.get(title) != null){
                return this.variableMap.get(title);
            } else {
                return this.parent.searchVariable(title);
            }
        } else {
            return this.variableMap.get(title);
        }
    }

    public FunctionScope searchFunction(String title){
        FunctionScope fs = this.functionMap.get(title);
        if(this.parent != null){
            if(fs != null){
                return fs;
            } else {
                return this.parent.searchFunction(title);
            }
        } else {
            return fs;
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
