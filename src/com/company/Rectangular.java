package com.company;

/**
 * Created by jv on 17/04/2016.
 */
public class Rectangular extends Shape {
    protected int x,y,r,a;


    public Rectangular(String color, int x, int y, int r, int a) {
        super(color);
        this.x = x;
        this.y = y;
        this.r = r;
        this.a=a;
    }

    @Override
    public void draw() {
        System.out.println("rect");

    }
}
