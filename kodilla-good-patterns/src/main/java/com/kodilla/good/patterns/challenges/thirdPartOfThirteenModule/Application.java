package com.kodilla.good.patterns.challenges.thirdPartOfThirteenModule;



public class Application {
    public static void main(String args[]) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();

        OrderRequest orderRequest1 = orderRequestRetriever.retrieve1();
        OrderRequest orderRequest2 = orderRequestRetriever.retrieve2();
        OrderRequest orderRequest3 = orderRequestRetriever.retrieve3();

        OrderProcessor orderProcessor = new OrderProcessor(new OrderService());
        orderProcessor.processing(orderRequest1);
        orderProcessor.processing(orderRequest2);
        orderProcessor.processing(orderRequest3);

        orderRequest1.getSupplier().process(orderRequest1);
        orderRequest2.getSupplier().process(orderRequest2);
        orderRequest3.getSupplier().process(orderRequest3);
}
}
