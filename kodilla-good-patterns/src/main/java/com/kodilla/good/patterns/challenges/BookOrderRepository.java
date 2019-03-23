package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class BookOrderRepository implements OrderRepository {

   public boolean createOrder(Client client,Product product,LocalDateTime dateOfOrder){
        return true;
    }

}
