package com.Codegym.Overriding;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.getName();

        Rectangle rectangle = new Rectangle();
        rectangle.getName();

        Shape rec2 = new Rectangle();
        rec2.getName();

    }
}
