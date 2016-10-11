package com.kidsclub.service;

import com.kidsclub.model.Order;
import java.util.List;

public interface OrderService {
    Order save(Order order);

    List<Order> findAll();

    Order findOne(long id);

}
