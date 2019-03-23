package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){
        Client client1 = new Client("Aleksandra","Radzikowska");
        Product product1 = new Product("headphones",1,199.00);
        LocalDateTime dateOfClient1Order = LocalDateTime.of(2019,3,1,21,28);
        LocalDateTime sentToClientAleksandra = LocalDateTime.of(2019,3,3,8,0);
        LocalDateTime delieveredToClientAleksandra= LocalDateTime.of(2019,3,8,6,0);


        return  new OrderRequest(client1,product1,dateOfClient1Order,sentToClientAleksandra,delieveredToClientAleksandra);
    }
}
