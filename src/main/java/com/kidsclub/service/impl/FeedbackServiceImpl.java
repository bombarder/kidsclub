package com.kidsclub.service.impl;

import com.kidsclub.model.Feedback;
import com.kidsclub.repository.FeedbackDao;
import com.kidsclub.service.FeedbackService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FeedbackServiceImpl implements FeedbackService {

    private FeedbackDao feedbackDao;

    public FeedbackServiceImpl(FeedbackDao feedbackDao) {
        this.feedbackDao = feedbackDao;
    }

    @Override
    public Feedback save(Feedback feedback) {
        return feedbackDao.save(feedback);
    }

    @Override
    public List<Feedback> findAll() {
        return feedbackDao.findAll();
    }
}
