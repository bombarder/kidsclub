package com.kidsclub.service.impl;

import com.kidsclub.model.Customer;
import com.kidsclub.repository.CustomerDao;
import com.kidsclub.service.CustomerService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Setter
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDao customerDao;

    @Override
    public List<Customer> getAll() {
        return customerDao.findAll();
    }

    @Override
    public Customer createUser(String login, String firstName, String lastName) {
        Customer customer = new Customer(firstName, lastName, login);
        return customer;
    }
    public void addUser(Customer customer){
        customerDao.save(customer);
    }
}
