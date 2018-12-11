package models;

import java.util.ArrayList;

/**
 * Created by micha on 12/11/2018.
 */
public class Function {
    private ArrayList<Symbol> params;

    private String title;

    private Type type;

    public Function(String title, Type type) {
        this.title = title;
        this.type = type;
    }

    public boolean addParam(Symbol param){
        return this.params.add(param);
    }

    public String getTitle() {
        return title;
    }

    public Type getType() {
        return type;
    }

    public ArrayList<Symbol> getParams() {
        return params;
    }
}
