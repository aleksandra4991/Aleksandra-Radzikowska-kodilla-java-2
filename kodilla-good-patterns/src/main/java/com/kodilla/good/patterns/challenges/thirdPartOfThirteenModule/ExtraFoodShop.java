package com.kodilla.good.patterns.challenges.thirdPartOfThirteenModule;

public class ExtraFoodShop implements Supplier {

    public boolean process(OrderRequest orderRequest){
        System.out.println(orderRequest.getClient() + "!: Właśnie dokonałeś zamówienia na:"+ orderRequest.getProduct() + " w ExtraFoodShop.");
        return true;
    }

}
