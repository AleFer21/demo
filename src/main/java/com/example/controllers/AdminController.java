package com.example.controllers;

import com.example.entities.Club;
import com.example.entities.Comment;
import com.example.entities.Court;
import com.example.entities.User;
import com.example.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private ClubService clubService;
    @Autowired
    private CommentService commentService;
    @Autowired
    private CourtService courtService;
    @Autowired
    private UserService userService;

    @GetMapping("/userList")
    public List<User> getAllUsers() {
        return userService.getAll();
    }

    @GetMapping("/clubList")
    public List<Club> getAllClubs() {
        return clubService.getAll();
    }

    @GetMapping("/commentList")
    public List<Comment> getAllComments() {
        return commentService.getAll();
    }

    @GetMapping("/courtList")
    public List<Court> getAllCourts() {
        return courtService.getAll();
    }

    @PostMapping("/unsubscribeUser/{id}")
    public void unsubscribeUser(@PathVariable long id) {
        adminService.unsubscribeUser(id);
    }

    @PostMapping("/unsubscribeClub/{id}")
    public void unsubscribeClub(@PathVariable long id) {
        adminService.unsubscribeClub(id);
    }

}
