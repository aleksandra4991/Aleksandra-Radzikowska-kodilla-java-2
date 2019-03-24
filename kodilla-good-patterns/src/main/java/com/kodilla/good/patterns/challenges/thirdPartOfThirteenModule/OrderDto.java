package com.kodilla.good.patterns.challenges.thirdPartOfThirteenModule;


public class OrderDto {

    public Client client;
    public Product product;
    public Supplier supplier;
    public boolean isOrdered;

    public OrderDto(Client client,Product product, Supplier supplier, boolean isOrdered) {
        this.client = client;
        this.product = product;
        this.supplier = supplier;
        this.isOrdered = isOrdered;
    }

    public Client getClient() {
        return client;
    }

    public Product getProduct() {
        return product;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
