package com.kidsclub.controller;

import com.kidsclub.model.Customer;
import com.kidsclub.repository.CustomerDao;
import com.kidsclub.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerDao customerDao;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String customer(Customer customer) {
        Customer savedCustomer = customerService.save(customer);
        return savedCustomer.getId().toString();
    }

    @RequestMapping(method = RequestMethod.GET)
    public Customer findCustomerById(@RequestParam long id) {
        return customerService.findOne(id);
    }
}