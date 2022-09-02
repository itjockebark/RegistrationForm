package com.example.registrationform.controller;

import com.example.registrationform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignUpController {

    @Autowired
    UserService userService;

    @GetMapping("/signup-form")
    public String signupForm() {
        return "signup-form";
    }
}
