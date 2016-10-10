package com.kidsclub.service.impl;

import com.kidsclub.model.Customer;
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
    public Entertainment save(Entertainment entertainment){
        return entertainmentDao.save(entertainment);
    }

    @Override
    public List<Entertainment> findAll() {
        return entertainmentDao.findAll();
    }

    @Override
    public Entertainment findOne(long id) {
        return entertainmentDao.findOne(id);
    }
}
