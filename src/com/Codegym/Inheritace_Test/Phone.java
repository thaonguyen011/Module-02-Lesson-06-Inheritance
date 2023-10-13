package com.Codegym.Inheritace_Test;

public class Phone {
    private long id;
    private String model;
    private String color;
    private double price;
    private int quantity;

    public Phone() {}

    public Phone(long id, String model, String color, double price, int quantity) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.price = price;
        this.quantity = quantity;

    }

    public String getModel() {return model;}

    public String toString() {
        return "A Phone with id: " + this.id + ", model: " + this.model + ", color: " + this.color  + " price: " + this.price + " and quantity: " + this.quantity + ".";
    }
}
