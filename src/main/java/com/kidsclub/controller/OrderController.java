package com.kidsclub.controller;

import com.kidsclub.model.Order;
import com.kidsclub.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping()
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping(path = "/order", method = RequestMethod.GET)
    public String showOrder(Model model) {
        model.addAttribute("createdOrder", orderService.findAll());
        return "order/order";
    }

    @RequestMapping(path = "/order", method = RequestMethod.POST)
    public @ResponseBody String showOrder(@RequestParam long userId, @RequestParam long itemId) {
        Order order = orderService.addToOrder(userId, itemId);
        return "Added to your Order";
    }

    @RequestMapping(path = "/order/add", method = RequestMethod.POST)
    public String saveOrder(Order order) {
        orderService.save(order);
        return "redirect:/order/all";
    }

    @RequestMapping(path = "/order/all", method = RequestMethod.GET)
    public String findAllOrders(Model model) {
        model.addAttribute("allOrders", orderService.findAll());
        return "order/order";
    }
}
