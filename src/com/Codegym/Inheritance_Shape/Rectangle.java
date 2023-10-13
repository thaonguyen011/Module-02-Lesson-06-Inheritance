package com.Codegym.Inheritance_Shape;

public class Rectangle extends Shape {
    private double width;
    private double height;
    
    Rectangle() {} 
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return this.width;
    }
    public double getHeight() {
        return this.height;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return (width + height) * 2;
    }
    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length= " + height + ", which is a subclass of " + super.toString();
    }
}
