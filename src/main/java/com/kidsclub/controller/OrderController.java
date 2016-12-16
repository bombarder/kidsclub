package com.kidsclub.controller;

import com.kidsclub.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping(method = RequestMethod.GET)
    public String showOrder(Model model) {
        model.addAttribute("createdOrder", orderService.findAll());
        return "order/order";
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody String showOrder(@RequestParam int itemId, @RequestParam int userId) {
        return "Added to your Order";
    }
}
