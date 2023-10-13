package com.Codegym.Overriding;

public class Shape {
    protected static String name = "shape";
    Shape() {}
    protected void getName() {
        System.out.println("I am a " + this.name +  " object");
    }
}
