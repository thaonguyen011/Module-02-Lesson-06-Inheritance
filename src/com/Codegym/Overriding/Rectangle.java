package com.Codegym.Overriding;

import static com.Codegym.Overriding.Shape.*;

public class Rectangle extends Shape{
    Rectangle () {}
//    Shape.name = "rectangle";
    @Override
    public void getName() {
        System.out.println("I am a rectangle object");
//        super.getName()

    }


}
