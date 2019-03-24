package com.kodilla.good.patterns.challenges.thirdPartOfThirteenModule;

public class HealthyShop implements Supplier {

    public boolean process(OrderRequest orderRequest){
        System.out.println(orderRequest.getClient()+ "!: Złożono zamówienie na:"+ orderRequest.getProduct() + " w HealthyShop.");
        return true;
    }
}
