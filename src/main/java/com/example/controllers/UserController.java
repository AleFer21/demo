package com.example.controllers;

import com.example.entities.User;
import com.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> getAll() {
        return userService.getAll();
    }

    @GetMapping("/list/{id}")
    public User getById(@PathVariable long id) {
        return userService.getById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody User user) {
        userService.save(user);
    }

    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable long id) {
        userService.delete(id);
    }

}
