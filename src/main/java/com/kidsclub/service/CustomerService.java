package com.kidsclub.service;

import com.kidsclub.model.Customer;
import java.util.List;

public interface CustomerService {

    Customer save(Customer customer);

    List<Customer> findAll();

    Customer findOne(long id);
}
