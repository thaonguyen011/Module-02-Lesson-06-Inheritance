package com.Codegym.Inheritance_Point;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    MovablePoint() {}
    MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super.setXY(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    MovablePoint( float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }
    public float[] getSpeed() {
        return new float[] {this.xSpeed, this.ySpeed};
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ",(" + this.xSpeed +"," + this.ySpeed +")";
    }

    public void move(MovablePoint movablePoint) {
        movablePoint.setX(getX() + xSpeed);
        movablePoint.setY(getY() + ySpeed);
    }
}
