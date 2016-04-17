package com.company;

/**
 * Created by jv on 17/04/2016.
 */
public abstract class Shape {
    protected String color="red";

    public abstract void draw();

    public Shape (String color){
        this.color=color;
    }
}
