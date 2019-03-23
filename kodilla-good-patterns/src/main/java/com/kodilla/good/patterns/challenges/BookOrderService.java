package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class BookOrderService implements OrderService {

    @Override
    public boolean order(Client client, Product product,LocalDateTime sentToClient, LocalDateTime delieveredToClient){
        return true;
    }
}
