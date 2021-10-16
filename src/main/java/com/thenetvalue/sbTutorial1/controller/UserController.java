package com.thenetvalue.sbTutorial1.controller;

import com.thenetvalue.sbTutorial1.model.User;
import com.thenetvalue.sbTutorial1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/users")

public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(produces = "application/json")
    @RequestMapping({"/validateLogin"})
    public User validateLogin () {
        return new User();
    }

    //CRUD operations (Create Read Update Delete)

    @PostMapping("/")
    public String addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") int id) {
        return userService.getUser(id);
    }

    @GetMapping("/username/{username}")
    public User getUserByUsername(@PathVariable("username") String username) {
        return userService.getUserByUsername(username);
    }

    @GetMapping("/username/like/{partialUsername}")
    public List<User> getUserContainingUsername(@PathVariable("partialUsername") String partialUsername) {
        return userService.getUserContainingUsername(partialUsername);
    }

    //allUsers - GET
    @GetMapping("/")
    public Iterable<User> allUsers() {
        return userService.allUsers();
    }

    //updateUser - PUT
    @PutMapping("/{id}")
    public String updateUser(@PathVariable("id") int id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    //deleteUser - DELETE
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        return userService.deleteUser(id);
    }

}
