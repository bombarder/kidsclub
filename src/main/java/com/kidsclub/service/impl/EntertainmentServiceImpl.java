package com.kidsclub.service.impl;

import com.kidsclub.model.Entertainment;
import com.kidsclub.repository.EntertainmentDao;
import com.kidsclub.service.EntertainmentService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Setter
public class EntertainmentServiceImpl implements EntertainmentService {

    @Autowired
    EntertainmentDao entertainmentDao;

    @Override
    public List<Entertainment> getAll() {
        return entertainmentDao.findAll();
    }

    @Override
    public Entertainment createEntertainment(String name, String description, int duration, int price) {
        Entertainment entertainment = new Entertainment();
        entertainment.setName(name);
        entertainment.setDescription(description);
        entertainment.setDuration(duration);
        entertainment.setPrice(price);
        return entertainment;
    }
    public void addEntertainment(Entertainment entertainment){
        entertainmentDao.save(entertainment);
    }
}
