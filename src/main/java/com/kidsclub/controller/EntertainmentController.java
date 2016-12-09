package com.kidsclub.controller;

import com.kidsclub.model.Entertainment;
import com.kidsclub.service.impl.EntertainmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("/entertainment")
public class EntertainmentController {

    @Autowired
    EntertainmentServiceImpl entertainmentServiceImpl;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String entertainment(Entertainment entertainment){
        Entertainment savedEntertainment = entertainmentServiceImpl.save(entertainment);
        return savedEntertainment.getId().toString();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String entertainment(Model model){
        return "entertainment";
    }
}

