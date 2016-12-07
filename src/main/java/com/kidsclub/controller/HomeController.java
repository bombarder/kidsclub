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

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.HEAD})
    public String index(Map<String, Object> model) {
        model.put("message", this.message);
        return "index";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contact(Model model) {
//        model.addAttribute("customer", new Customer());
        return "contact";
    }

    @RequestMapping(value = "/some", method = RequestMethod.GET)
    public String some(Model model) {
        Customer customer = new Customer();
        customer.setFirstName("Misha");
        customer.setLastName("Kukuruza");
        customer.setLogin("mk");

        model.addAttribute("customer", customer);

        return "other-page";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String some(Customer customer, Model model) {
        customer.setLogin("" + customer.getFirstName().charAt(0) + customer.getLastName().charAt(0));

        System.out.println("user saved to db " + customer);

        model.addAttribute("customer", customer);
        return "other-page";
    }
}
