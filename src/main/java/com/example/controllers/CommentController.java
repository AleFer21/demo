package com.example.controllers;

import com.example.entities.Comment;
import com.example.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/list")
    public List<Comment> getAll() {
        return commentService.getAll();
    }

    @GetMapping("/list/{id}")
    public Comment getById(@PathVariable long id) {
        return commentService.getById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Comment comment) {
        commentService.save(comment);
    }

    @DeleteMapping("/delete")
    public void remove(@PathVariable long id) {
        commentService.delete(id);
    }

}
