package com.kodilla.good.patterns.challenges;

public class OrderProccesor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProccesor(final InformationService informationService,
                           final OrderService orderService,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getClient(), orderRequest.getProduct(),orderRequest.getSentToClient(),
                orderRequest.getDelieveredToClient());

        if(isOrdered) {
            informationService.inform(orderRequest.getClient());
            orderRepository.createOrder(orderRequest.getClient(),orderRequest.getProduct(),orderRequest.getDateOfOrder());
            return new OrderDto(orderRequest.getClient(), true);
        } else {
            return new OrderDto(orderRequest.getClient(),false);
        }
    }
}

