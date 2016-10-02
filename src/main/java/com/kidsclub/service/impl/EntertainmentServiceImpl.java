package com.kidsclub.service.impl;

import com.kidsclub.model.Entertainment;
import com.kidsclub.repository.EntertainmentDao;
import com.kidsclub.service.EntertainmentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EntertainmentServiceImpl implements EntertainmentService {

    @Autowired
    EntertainmentDao entertainmentDao;

    @Override
    public List<Entertainment> getAll() {
        return entertainmentDao.findAll();
    }

    @Override
    public Entertainment createEntertainment(String name, String description, int duration, int price) {
        Entertainment entertainment = new Entertainment(name, description, duration, price);
        return entertainment;
    }
}
