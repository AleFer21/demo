package com.example.services;

import com.example.entities.Video;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface VideoService {

    public List<Video> getAll();

    public Video save(MultipartFile file) throws IOException;

    public void delete(long id);

    public Video getById(long id);

}
