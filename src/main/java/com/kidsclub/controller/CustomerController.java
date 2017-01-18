package com.kidsclub.controller;

import com.kidsclub.model.Customer;
import com.kidsclub.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller()
public class CustomerController {

    @Autowired
    CustomerService customerService;

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
}
