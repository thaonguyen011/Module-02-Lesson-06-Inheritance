package com.Codegym.Inheritace_Test;

public class IPhone extends Phone{
    private boolean isHasButtonVirtual;
    public IPhone(long id, String model, String color, double price, int quantity) {
        super(id, model, color, price, quantity);
    }

    public IPhone() {
    }

    public boolean isHasButtonVirtual() {
        return isHasButtonVirtual;
    }

    public void setHasButtonVirtual(boolean hasButtonVirtual) {
        isHasButtonVirtual = hasButtonVirtual;
    }

    @Override
    public String toString() {
        return "A Iphone with having virtual button is " + this.isHasButtonVirtual + ", which is a subclass of " + super.toString();
    }
}
