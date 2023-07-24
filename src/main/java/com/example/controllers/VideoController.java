package com.example.controllers;

import com.example.entities.Video;
import com.example.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @GetMapping("/userVideo/{id}")
    public ResponseEntity<byte[]> getVideoById(@PathVariable long id) {
        Video video = videoService.getById(id);
        byte[] videoUser = video.getVideo();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType("video/mp4"));
        headers.setContentLength(videoUser.length);
        return new ResponseEntity<>(videoUser, headers, HttpStatus.OK);
    }

}
