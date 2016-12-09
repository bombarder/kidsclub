package com.kidsclub.controller;

import com.kidsclub.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.Map;
import java.util.Random;

@Controller
public class HomeController {

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD})
    public String index() {
        return "index";
    }

    @RequestMapping(path = "/contact", method = RequestMethod.GET)
    public String contact() {
        return "contact";
    }

    @RequestMapping(path = "/order", method = RequestMethod.GET)
    public String order() {
        return "order";
    }
}
