package com.kidsclub.service.impl;

import com.kidsclub.model.Food;
import com.kidsclub.model.Order;
import com.kidsclub.model.OrderStatus;
import com.kidsclub.repository.FoodDao;
import com.kidsclub.repository.OrderDao;
import com.kidsclub.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderDao orderDao;
    @Autowired
    FoodDao foodDao;

    @Override
    public Order save(Order order) {
        return orderDao.save(order);
    }

    @Override
    public List<Order> findAll() {
        return orderDao.findAll();
    }

    @Override
    public Order findOne(long id) {
        return orderDao.findOne(id);
    }

    @Override
    public Order addToOrder(long userId, long itemId) {
        Order order = orderDao.findByCustomerIdAndStatus(userId, OrderStatus.OPEN);
        Food food = foodDao.findOne(itemId);
        order.getFood().add(food);
        orderDao.save(order);
        return order;
    }

//    Find active order usera
//        esli ego net sdelat order
//        find goods by item id
//        add goods to the order
//        save order
//        return order

    @Override
    public Order findActiveOrders(int userId) {

       return null;
    }
}
