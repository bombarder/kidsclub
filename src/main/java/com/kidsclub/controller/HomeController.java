package com.kidsclub.controller;

import com.kidsclub.service.CustomerService;
import com.kidsclub.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    OrderService orderService;

    @Autowired
    CustomerService customerService;

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD})
    public String index() {
        return "index";
    }

    @RequestMapping(path = "/contact", method = RequestMethod.GET)
    public String contact() {
        return "contact";
    }

    @RequestMapping(path = "/order", method = RequestMethod.GET)
    public String order() {
        return "order";
    }

    @RequestMapping(path = "/food", method = RequestMethod.GET)
    public String food() {
        return "food";
    }

    @RequestMapping(path = "/entertainment", method = RequestMethod.GET)
    public String entertainment() {
        return "entertainment";
    }

    @RequestMapping(path = "/order/edit", method = RequestMethod.GET)
    public String editOrder(Model model) {
        model.addAttribute("order", orderService.findAll());
        return "order/edit";
    }

    @RequestMapping(path = "/food/edit", method = RequestMethod.GET)
    public String editFood() {
        return "food/edit";
    }

    @RequestMapping(path = "/customer", method = RequestMethod.GET)
    public String findOneCustomer(@RequestParam long id, Model model) {
        model.addAttribute("customer", customerService.findOne(id));
        return "customer/one";
    }

    @RequestMapping(path = "/customer/all", method = RequestMethod.GET)
    public String findAllCustomers(Model model) {
        model.addAttribute("customers", customerService.findAll());
        return "customer/many";
    }
}
