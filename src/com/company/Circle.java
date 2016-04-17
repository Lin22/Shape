package com.company;

/**
 * Created by jv on 17/04/2016.
 */
public class Circle extends Shape {

    protected  int x,y,r;

    public Circle(String color, int x, int y, int r) {
        super(color);
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override

    public void draw(){
        System.out.println("Drawing circle");
    }
}
