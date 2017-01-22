package com.kidsclub.service;

import com.kidsclub.model.Feedback;

import java.util.List;

public interface FeedbackService {

    Feedback save(Feedback feedback);
    List<Feedback> findAll();
}
