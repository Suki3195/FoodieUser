package com.foodie.users.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/user")
public class UserController {

    @PostMapping(value = "/register")
    public ModelAndView authenticateCustomer(@RequestParam String name,
                                         @RequestParam String description,
                                             @RequestParam String dish,
                                             @RequestParam String foodType
                                             ) {

      String regex = ".*[A-z]*.";
        if (name.matches(regex)) {
            ModelAndView modelAndView = new ModelAndView("welcome");
            modelAndView.addObject("username" , name);
            modelAndView.addObject("dish" , dish);
            modelAndView.addObject("description" , description);
            modelAndView.addObject("foodType" , foodType);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("error");
            modelAndView.addObject("username" , name);
            return modelAndView;
        }


    }
}