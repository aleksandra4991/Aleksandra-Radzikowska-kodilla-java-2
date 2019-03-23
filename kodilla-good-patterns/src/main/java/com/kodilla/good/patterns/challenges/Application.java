package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class Application {

    public static void main(String args[]) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProccesor orderProccesor = new OrderProccesor
                (new SmsService(), new BookOrderService(), new BookOrderRepository());
        orderProccesor.process(orderRequest);
    }
}