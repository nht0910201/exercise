package com.hcmute.ex.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "")
public class HomeController {
    @GetMapping(path = "/Home")
    public String showHomePage() {
        return "viewHome/Index";
    }
}
