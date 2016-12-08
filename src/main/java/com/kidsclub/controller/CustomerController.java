package com.kidsclub.controller;

import com.kidsclub.model.Customer;
import com.kidsclub.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerServiceImpl customerServiceImpl;

    // Переход на форму сохранения
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String customer(Customer customer, Model model) {
        model.addAttribute("customer", customerServiceImpl.save(customer));
        return "customer/edit";
    }
    // Поиск определенного посетителя
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String findCustomerById(@RequestParam("id") long id, Model model) {
        model.addAttribute("customer", customerServiceImpl.findOne(id));
        return "customer/search";
    }
    // Поиск всех посетителей сразу
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public String findAllCustomers(Model model){
        model.addAttribute("customers", customerServiceImpl.findAll());
        return "customer/findAll";
    }
}