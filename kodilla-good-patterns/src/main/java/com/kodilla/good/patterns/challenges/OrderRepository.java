package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderRepository {

    boolean createOrder(Client client, Product product,LocalDateTime dateOfOrder);
}
