package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private Client client;
    private Product product;
    private LocalDateTime dateOfOrder;
    private LocalDateTime sentToClient;
    private LocalDateTime delieveredToClient;


    public OrderRequest(final Client client,final Product product,LocalDateTime dateOfOrder,final LocalDateTime sentToClient,final LocalDateTime delieveredToClient) {
        this.client=client;
        this.product=product;
        this.dateOfOrder = dateOfOrder;
        this.sentToClient = sentToClient;
        this.delieveredToClient = delieveredToClient;
        this.dateOfOrder = dateOfOrder;
    }

    public Client getClient() { return client; }

    public Product getProduct(){ return product; }

    public LocalDateTime  getDateOfOrder(){ return dateOfOrder; }

    public LocalDateTime getSentToClient() {
        return sentToClient;
    }

    public LocalDateTime getDelieveredToClient() {
        return delieveredToClient;
    }
}
