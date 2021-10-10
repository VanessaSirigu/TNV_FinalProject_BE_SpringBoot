package com.thenetvalue.sbTutorial1.controller;

import com.thenetvalue.sbTutorial1.model.User;
import com.thenetvalue.sbTutorial1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserPreferredGenreController {
    //UserPreferredGenreService userPreferredGenreService;
    UserService userService;

    @Autowired
    public UserPreferredGenreController() {//UserPreferredGenreService userPreferredGenreService, UserService userService) {
        //this.userPreferredGenreService = userPreferredGenreService;
        this.userService = userService;
    }

//    @GetMapping("/{username}")
//    public UserPreferredGenre getUserPreferredGenreByUsername(@PathVariable("username") int username) {
//        User user = userService.getUserByUsername(username);
//        return userPreferredGenreService.getUserPreferredGenreByUserId(userId);
//
//    }


}
