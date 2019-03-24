package com.kodilla.good.patterns.challenges.thirdPartOfThirteenModule;

public class GlutenFreeShop implements Supplier {

    @Override
    public boolean process(OrderRequest orderRequest){
        System.out.println(orderRequest.getClient()+"!: Przyjęto zamówienie na:"+ orderRequest.getProduct()+ " w GlutenFreeShop.");
        return true;
    }
}
