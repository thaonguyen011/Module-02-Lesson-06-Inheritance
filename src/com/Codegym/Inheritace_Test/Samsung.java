package com.Codegym.Inheritace_Test;

public class Samsung extends Phone{
    private boolean isHasPen;
    public Samsung(long id, String model, String color, double price, int quantity) {
        super(id, model, color, price, quantity);
    }

    public Samsung() {
    }

    public boolean isHasPen() {
        return isHasPen;
    }

    public void setHasPen(boolean hasPen) {
        isHasPen = hasPen;
    }

    @Override
    public String toString() {
        return "A Samsung with having pen is " + this.isHasPen + ", which is a subclass of " + super.toString();
    }
}
