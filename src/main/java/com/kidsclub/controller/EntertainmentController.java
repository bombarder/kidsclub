package com.kidsclub.controller;

import com.kidsclub.model.Entertainment;
import com.kidsclub.service.EntertainmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EntertainmentController {

    @Autowired
    EntertainmentService entertainmentService;

    @RequestMapping(path = "/entertainment", method = RequestMethod.GET)
    public String entertainment(@RequestParam long id, Model model) {
        model.addAttribute("entertainment", entertainmentService.findOne(id));
        return "entertainment/one";
    }

    @RequestMapping(path = "/entertainment/all", method = RequestMethod.GET)
    public String findAllEntertainment(Model model) {
        model.addAttribute("someEntertainment", entertainmentService.findAll());
        return "entertainment/many";
    }

    @RequestMapping(path = "/entertainment/add", method = RequestMethod.POST)
    public String saveCustomer(Entertainment entertainment) {
        entertainmentService.save(entertainment);
        return "redirect:/entertainment/all";
    }
}
