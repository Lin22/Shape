package com.company;


public class Circle extends Shape implements Inter {

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

    @Override
    public void moveRight() {
      y=-1;
    }

    @Override
    public void moveLeft() {
        x=-1;

    }

    @Override
    public void moveUp() {
x+=1;
    }

    @Override
    public void moveDown() {
y+=1;
    }

    @Override
    public void moveToDefaultPosition() {
x=defaultX;
        y=defaultY;
    }
}
