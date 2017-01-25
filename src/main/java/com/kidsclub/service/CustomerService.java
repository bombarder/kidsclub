package com.kidsclub.service;

import com.kidsclub.model.Customer;
import java.util.List;

public interface CustomerService {

    void save(Customer customer);

    List<Customer> findAll();

    Customer findOne(long id);

    Customer findByCustomerName(String customerName);
}
