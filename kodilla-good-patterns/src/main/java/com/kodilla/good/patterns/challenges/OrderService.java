package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderService {

    boolean order(Client client, Product product, LocalDateTime sentToClient, LocalDateTime delieveredToClient);
}
