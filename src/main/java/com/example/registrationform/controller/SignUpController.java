package com.example.registrationform.controller;

import com.example.registrationform.model.User;
import com.example.registrationform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    @Autowired
    UserService userService;

    @GetMapping("/signup-form")
    public String signupForm(Model model) {
        model.addAttribute("user", new User());
        return "signup-form";
    }

    @PostMapping("/signup-form/create-user")
    public String createUser(User user) {
        userService.createUser(user);
        return "redirect:/signup-form";
    }
}
