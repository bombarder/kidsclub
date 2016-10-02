package com.kidsclub.service;

import com.kidsclub.model.Entertainment;
import com.kidsclub.model.Food;
import com.kidsclub.model.Order;
import com.kidsclub.model.Customer;

import java.util.ArrayList;
import java.util.List;

public interface OrderService {
    Order createOrder(Entertainment entertainment, ArrayList<Food> foodList, Customer buyer);
    List<Order> getActiveOrders();
    void closeOrder(Order order);

}
