package com.Codegym.Inheritace_Circle;

public class Cylinder extends Circle{
    private double height;
    Cylinder() {}
    Cylinder(double radius, double height) {
        super.setRadius(radius);
        this.height = height;
    }
    public double getHeight() {return this.height;}
    public void setHeight(double height) {this.height = height;}

    public double getVolume() {return this.height * super.getArea();}

    @Override
    public String toString() {
        return "A Cylinder  width height = " + this.height + ", which is a subclass of " + super.toString() ;
    }
}
