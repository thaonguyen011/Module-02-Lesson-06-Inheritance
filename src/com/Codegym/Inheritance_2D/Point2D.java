package com.Codegym.Inheritance_2D;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    Point2D() {}
    Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() { return this.x;}
    public float getY() {return this.y;}
    public float[] getXY() { return new float[]{this.x, this.y};}
    public void setX(float x) { this.x = x;}
    public void setY(float y) { this.y = y;}
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

}
