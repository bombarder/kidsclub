package com.kidsclub.service.impl;

import com.kidsclub.model.Customer;
import com.kidsclub.repository.CustomerDao;
import com.kidsclub.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerDao customerDao;

    @Override
    public Customer save(Customer customer){
        return customerDao.save(customer);
    }

    @Override
    public List<Customer> findAll() {
        return customerDao.findAll();
    }

    @Override
    public Customer findOne(long id) {
        return customerDao.findOne(id);
    }

}
