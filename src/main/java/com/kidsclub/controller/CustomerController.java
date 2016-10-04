package com.kidsclub.controller;

import com.kidsclub.model.Customer;
import com.kidsclub.repository.CustomerDao;
import com.kidsclub.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class CustomerController {

    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerDao customerDao;

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public Customer customer() {
       Customer customer = customerService.createUser("testOne","Bob","Marley");
        return customer;
    }
}
