package models;

/**
 * Created by micha on 12/11/2018.
 */
public class FunctionScope extends Scope {

    private Function function;

    public FunctionScope(Scope parent, String name, Function function) {
        super(parent, name);
        this.function = function;
        for(Symbol s : function.getParams()){
            addVariableToScope(s);
            setPosOnSymbol(s);
        }
    }

    public Function getFunction() {
        return function;
    }
}
