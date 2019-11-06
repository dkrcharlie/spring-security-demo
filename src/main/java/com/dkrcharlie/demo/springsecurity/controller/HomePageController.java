package com.dkrcharlie.demo.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {

    @GetMapping("/")
    public String publicHomePage(){
        return "<H1>Public Home Page</H1>";
    }

    @GetMapping("/user")
    public String userHomePage(){
        return "<H1>User Home Page</H1>";
    }

    @GetMapping("/admin")
    public String adminHomePage() {
        return "<H1>Admin Home Page</H1>";
    }

}
