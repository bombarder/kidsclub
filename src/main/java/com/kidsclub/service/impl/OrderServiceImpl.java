package com.kidsclub.service.impl;


import com.kidsclub.model.Order;
import com.kidsclub.repository.OrderDao;
import com.kidsclub.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderDao orderDao;


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
}
