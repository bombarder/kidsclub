package com.kidsclub.service.impl;

import com.kidsclub.model.Feedback;
import com.kidsclub.repository.FeedbackDao;
import com.kidsclub.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FeedbackserviceImpl implements FeedbackService {

    @Autowired
    FeedbackDao feedbackDao;

    @Override
    public Feedback save(Feedback feedback) {
        return feedbackDao.save(feedback);
    }

    @Override
    public List<Feedback> findAll() {
        return feedbackDao.findAll();
    }
}
