package com.kidsclub.service;

import com.kidsclub.model.Customer;
import com.kidsclub.model.Entertainment;

import java.util.List;


public interface EntertainmentService {
    List<Entertainment> getAll();
    Entertainment createEntertainment(String name, String description, int duration, int price);
}
