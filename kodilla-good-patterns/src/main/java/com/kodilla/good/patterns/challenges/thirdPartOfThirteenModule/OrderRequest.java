package com.kodilla.good.patterns.challenges.thirdPartOfThirteenModule;

public class OrderRequest{

    private Client client;
    private Product product;
    private Supplier supplier;


    public OrderRequest(Client client,Product product,Supplier supplier) {
        this.client=client;
        this.product = product;
        this.supplier=supplier;
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
}
