package com.kidsclub.service;


import com.kidsclub.model.Entertainment;

import java.util.List;


public interface EntertainmentService {

    Entertainment save(Entertainment entertainment);

    List<Entertainment> findAll();

    Entertainment findOne(long id);
}

