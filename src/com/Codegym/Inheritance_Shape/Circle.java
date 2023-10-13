package com.Codegym.Inheritance_Shape;

public class Circle extends Shape{
    private double radius;
    Circle() {
        radius = 1.0;
    }
    Circle(double r) {radius = r;}
    public double getRadius() {
        return radius;
    }
    public void setRadius(double r) {
        radius = r;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return Math.PI * radius * 2;
    }
    @Override
    public String toString() {
        return "A Circle with radius= " + radius + ", which is a subclass of " + super.toString();
    }
}
