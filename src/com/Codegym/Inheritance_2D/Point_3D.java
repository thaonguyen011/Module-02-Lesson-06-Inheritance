package com.Codegym.Inheritance_2D;

public class Point_3D extends Point2D{
    private float z = 0.0f;
    Point_3D() {}
    Point_3D(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }
    public float getZ() {return this.z;}
    public void setZ(float z) {this.z = z;}

    public float[] getXYZ() {return new float[] {super.getX(), super.getY(), this.z};}
    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }
    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + this.getY() + ")";
    }

}
