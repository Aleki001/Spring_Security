package com.alexkinyua.security_app.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    @GetMapping
    public String homePage(){
        return "home";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
