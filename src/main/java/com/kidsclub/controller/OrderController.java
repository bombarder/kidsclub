package com.kidsclub.controller;

import com.kidsclub.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping(path = "/order", method = RequestMethod.GET)
    public String order() {
        return "order";
    }

    @RequestMapping(path = "/order/edit", method = RequestMethod.GET)
    public String editOrder(Model model) {
        model.addAttribute("order", orderService.findAll());
        return "order/edit";
    }
}
