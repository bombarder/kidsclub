package com.kidsclub.controller;

import com.kidsclub.model.Feedback;
import com.kidsclub.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FeedbackController {
    @Autowired
    FeedbackService feedbackService;

    @RequestMapping(path = "/feedback", method = RequestMethod.GET)
    public String feedback() {
        return "feedback";
    }

    @RequestMapping(path = "/feedback/all", method = RequestMethod.GET)
    public String findAllFeedback(Model model) {
        model.addAttribute("someFeedback", feedbackService.findAll());
        return "feedback";
    }

    @RequestMapping(path = "/feedback/add", method = RequestMethod.POST)
    public String postFeedback(Feedback feedback) {
        feedbackService.save(feedback);
        return "redirect:/feedback/all";
    }
}
