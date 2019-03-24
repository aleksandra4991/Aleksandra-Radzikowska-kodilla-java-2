package com.kodilla.good.patterns.challenges.thirdPartOfThirteenModule;

public class OrderRequestRetriever {

    public OrderRequest retrieve1() {
        Client client1 = new Client("Max");
        Product product1 = new Product("Eggs", 30);
        Supplier supplier1 = new ExtraFoodShop();
        return new OrderRequest(client1, product1, supplier1);
    }

    public OrderRequest retrieve2() {
        Client client2 = new Client("Alex");
        Product product2 = new Product("Bread", 1);
        Supplier supplier2 = new GlutenFreeShop();
        return new OrderRequest(client2, product2, supplier2);
    }

    public OrderRequest retrieve3() {
        Client client3 = new Client("Jess");
        Product product3 = new Product("Butter", 2);
        Supplier supplier3 = new HealthyShop();
        return  new OrderRequest(client3,product3,supplier3);
    }
}
