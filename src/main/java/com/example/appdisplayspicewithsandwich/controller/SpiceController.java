package com.example.appdisplayspicewithsandwich.controller;


import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpiceController {

    @RequestMapping("/")
    public String home(){
        return "home";
    }


    @RequestMapping("/save")
    public ModelAndView save(@RequestParam("condiment") String condiment) {
        ModelAndView mav = new ModelAndView("success");
        mav.addObject("condiment", condiment);
        return mav;
    }
}
