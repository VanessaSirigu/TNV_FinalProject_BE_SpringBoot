package com.thenetvalue.sbTutorial1.controller;

import com.thenetvalue.sbTutorial1.model.User;
import com.thenetvalue.sbTutorial1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:4200/**"})
@RestController
@RequestMapping("/users")

public class BasicAuthController {
    private UserService userService;

    @Autowired
    public BasicAuthController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(produces = "application/json")
    @RequestMapping({"/validateLogin"})
    public User validateLogin() {
        return new User();
    }
}