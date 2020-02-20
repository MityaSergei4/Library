package com.example.test.controller;

import com.example.test.domain.User;
import com.example.test.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/registration")
    public String getRegistration(){
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(User user, @RequestParam String login, @RequestParam String password){
        // ????
    }
}
