package com.example.controllers;

import com.example.entities.Club;
import com.example.services.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/club")
public class ClubController {

    @Autowired
    private ClubService clubService;

    @GetMapping("/list")
    public List<Club> getAll() {
        return clubService.getAll();
    }

    @GetMapping("/list/{id}")
    public Club getById(@PathVariable long id) {
        return clubService.getById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Club club) {
        clubService.save(club);
    }

    @DeleteMapping("/delete")
    public void remove(@PathVariable long id) {
        clubService.delete(id);
    }

}
