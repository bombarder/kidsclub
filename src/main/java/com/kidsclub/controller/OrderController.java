package com.kidsclub.controller;

import com.kidsclub.service.impl.CustomerServiceImpl;
import com.kidsclub.service.impl.EntertainmentServiceImpl;
import com.kidsclub.service.impl.FoodServiceImpl;
import com.kidsclub.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping()
public class OrderController {

    @Autowired
    EntertainmentServiceImpl entertainmentServiceImpl;
    @Autowired
    FoodServiceImpl foodServiceImpl;
    @Autowired
    CustomerServiceImpl customerServiceImpl;
    @Autowired
    OrderServiceImpl orderServiceImpl;

    //Показ заказа
    @RequestMapping(value = "/getOrder", method = RequestMethod.GET)
    public String getOrder(Model model){
        model.addAttribute("entertainment", entertainmentServiceImpl.findAll());
        model.addAttribute("food", foodServiceImpl.findAll());
        model.addAttribute("customer", customerServiceImpl.findAll());
        return "other-page";
    }
}
