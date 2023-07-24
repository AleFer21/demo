package com.example.controllers;

import com.example.entities.Court;
import com.example.services.CourtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/court")
public class CourtController {

    @Autowired
    private CourtService courtService;

    @GetMapping("/list")
    public List<Court> getAll() {
        return courtService.getAll();
    }

    @GetMapping("/list/{id}")
    public Court getById(@PathVariable long id) {
        return courtService.getById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Court court) {
        courtService.save(court);
    }

    @DeleteMapping("/delete")
    public void remove(@PathVariable long id) {
        courtService.delete(id);
    }

}
