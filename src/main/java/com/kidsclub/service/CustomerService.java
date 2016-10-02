package com.kidsclub.service;

import com.kidsclub.model.Customer;
import java.util.List;

public interface CustomerService {
    List<Customer> getAll();
    Customer createUser(String login, String firstName, String lastName);
}
