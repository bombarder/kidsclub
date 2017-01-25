package com.kidsclub.service.impl;

import com.kidsclub.model.Customer;
import com.kidsclub.repository.CustomerDao;
import com.kidsclub.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(Customer customer){
        customer.setPass(bCryptPasswordEncoder.encode(customer.getPass()));
        customerDao.save(customer);
    }

    @Override
    public List<Customer> findAll() {
        return customerDao.findAll();
    }

    @Override
    public Customer findOne(long id) {
        return customerDao.findOne(id);
    }

    @Override
    public Customer findByCustomerName(String login) {
        return customerDao.findByLogin(login);
    }
}
