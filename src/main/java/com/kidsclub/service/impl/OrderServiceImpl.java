package com.kidsclub.service.impl;

import com.kidsclub.model.Entertainment;
import com.kidsclub.model.Food;
import com.kidsclub.model.Order;
import com.kidsclub.model.User;
import com.kidsclub.repository.OrderDao;
import com.kidsclub.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderDao orderDao;

    @Override
    public Order createOrder(Entertainment entertainment, ArrayList<Food> foodList, User buyer) {
        Order order = new Order(entertainment, foodList, buyer);
        return order;
    }

    @Override
    public List<Order> getActiveOrders() {
        return orderDao.findAll();
    }

    @Override
    public void closeOrder(Order order) {
        orderDao.delete(order);
    }
}
