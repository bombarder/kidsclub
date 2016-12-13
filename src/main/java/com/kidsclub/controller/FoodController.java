package com.kidsclub.controller;

import com.kidsclub.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoodController {

    @Autowired
    FoodService foodService;

    @RequestMapping(path = "/food", method = RequestMethod.GET)
    public String findSomeFood(@RequestParam long id, Model model) {
        model.addAttribute("food", foodService.findOne(id));
        return "food/one";
    }

    @RequestMapping(path = "/food/all", method = RequestMethod.GET)
    public String findAllFood(Model model) {
        model.addAttribute("someFood", foodService.findAll());
        return "food/many";
    }
}
