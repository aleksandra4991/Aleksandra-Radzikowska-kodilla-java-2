package com.kodilla.good.patterns.challenges.thirdPartOfThirteenModule;

public class Product {

    private String name;
    private int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + " w ilości: " + quantity;
    }
}
