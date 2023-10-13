package com.Codegym.Inheritance_Shape;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Shape shape = new Shape();
       Shape circle = new Circle();
       Shape rectangle = new Rectangle();
       Shape square1 = new Square();
       Rectangle square2= new Square();
       Square square3 = new Square();

       shape.getFilled();
       circle.getColor();
       rectangle.getColor();
       square1.getColor();
       square2.getWidth();
       square3.getSide();
       square3.getFilled();
       square3.setColor("red");

       System.out.println(shape);
       System.out.println(circle);
       System.out.println(rectangle);
       System.out.println(square1);//variable type = Shape;
       System.out.println(square2);// variable type = Rectangle;
       System.out.println(square3);// variable type = Square;
    }
}