package com.kidsclub.controller;

import com.kidsclub.service.CustomerService;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class CustomerControllerTest {

    @Mock
    private CustomerService customerService;

    @InjectMocks
    private CustomerController customerController;

}
