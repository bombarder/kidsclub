package com.kidsclub.service.impl;

import com.kidsclub.model.Entertainment;
import com.kidsclub.repository.EntertainmentDao;
import com.kidsclub.service.EntertainmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntertainmentServiceImpl implements EntertainmentService {

    private EntertainmentDao entertainmentDao;

    public EntertainmentServiceImpl(EntertainmentDao entertainmentDao) {
        this.entertainmentDao = entertainmentDao;
    }

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
