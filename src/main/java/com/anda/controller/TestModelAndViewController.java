package com.anda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class TestModelAndViewController {

    @RequestMapping
    public ModelAndView testIndex(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}
