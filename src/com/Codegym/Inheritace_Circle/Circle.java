package com.Codegym.Inheritace_Circle;

public class Circle {
    private double radius;
    private String color;

    Circle() {}
    Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() { return this.radius; }
    public String getColor() { return this.color;}
    public void setRadius(double radius) { this.radius = radius;}
    public void setColor(String color) { this.color = color;}
    public double getArea() { return this.radius * this.radius * Math.PI;}
    public double getPerimeter() { return this.radius * 2 * Math.PI;}


    public String toString() {
        return "A Circle with radius = " + this.radius + " and color = " + this.color;
    }
}
