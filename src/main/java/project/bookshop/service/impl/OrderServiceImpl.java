package project.bookshop.service.impl;

import org.springframework.stereotype.Service;
import project.bookshop.repository.OrderRepository;
import project.bookshop.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
}
