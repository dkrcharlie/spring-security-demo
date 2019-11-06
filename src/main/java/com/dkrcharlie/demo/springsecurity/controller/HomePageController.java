package com.dkrcharlie.demo.springsecurity.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {

    @GetMapping("/")
    public String publicHomePage(){
        return "<H1>Public Home Page</H1>";
    }

    @GetMapping("/user")
    @PreAuthorize("hasAnyRole('ROLE_USER','ROLE_ADMIN')")
    public String userHomePage(){
        return "<H1>User Home Page</H1>";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String adminHomePage() {
        return "<H1>Admin Home Page</H1>";
    }

    @GetMapping("/manager")
    @Secured("hasRole('ROLE_MANAGER')")
    public String managerHomePage() {
        return "<H1>Manager Home Page</H1>";
    }

}
