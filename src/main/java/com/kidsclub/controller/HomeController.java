package com.kidsclub.controller;

import com.kidsclub.model.Customer;
import com.kidsclub.service.CustomerService;
import com.kidsclub.service.EntertainmentService;
import com.kidsclub.service.FoodService;
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

    @Autowired
    FoodService foodService;

    @Autowired
    EntertainmentService entertainmentService;

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD})
    public String index() {
        return "index";
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

    @RequestMapping(path = "/customer/add", method = RequestMethod.POST)
    public String saveCustomer(Customer customer) {
        customerService.save(customer);

        return "redirect:/customer/all";
    }

    @RequestMapping(path = "/food", method = RequestMethod.GET)
    public String findSomeFood(@RequestParam long id, Model model) {
        model.addAttribute("food", foodService.findOne(id));
        return "food/one";
    }

    @RequestMapping(path = "/food/all", method = RequestMethod.GET)
    public String findAllFood(Model model) {
        model.addAttribute("someFood", foodService.findAll());
        return "food/many";
    }

    @RequestMapping(path = "/entertainment", method = RequestMethod.GET)
    public String entertainment(@RequestParam long id, Model model) {
        model.addAttribute("entertainment", entertainmentService.findOne(id));
        return "entertainment/one";
    }

    @RequestMapping(path = "/entertainment/all", method = RequestMethod.GET)
    public String findAllEntertainment(Model model) {
        model.addAttribute("someEntertainment", entertainmentService.findAll());
        return "entertainment/many";
    }

    @RequestMapping(path = "/contact", method = RequestMethod.GET)
    public String contact() {
        return "contact";
    }

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
