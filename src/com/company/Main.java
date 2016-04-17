package com.company;

/**
 * Created by jv on 17/04/2016.
 */
public class Main {
    public static void main(String[]args){

Shape s[]=new Shape[3];
        s[0]=new Circle("black",10,10,5);
        s[1]=new Rectangular("yellow",10,10,5,50);
        s[2]=new Circle("green",10,10,5);
         for (int i=0;i<s.length;i++)
             s[i].draw();

    }
}
