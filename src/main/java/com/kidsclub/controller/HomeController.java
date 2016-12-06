package com.kidsclub.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;
import java.util.Random;

@Controller
public class HomeController {

    @Value("${application.message:Hello World}")
    private String message = "Hello World";
    private Random random = new Random();

    @GetMapping("/")
    public String index(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        model.put("random", random.nextInt());
        return "index";
    }
}
