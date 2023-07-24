package com.example.services;

import com.example.entities.Video;
import com.example.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoRepository videoRepository;

    @Override
    @Transactional
    public List<Video> getAll() {
        return videoRepository.findAll();
    }

    @Override
    @Transactional
    public Video save(MultipartFile file) throws IOException {
        try {
            Video video = new Video();
            video.setMime(file.getContentType());
            video.setName(file.getName());
            video.setVideo(file.getBytes());
            videoRepository.save(video);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    @Override
    @Transactional
    public void delete(long id) {
        Video video = videoRepository.findById(id).get();
        videoRepository.delete(video);
    }

    @Override
    public Video getById(long id) {
        return videoRepository.findById(id).get();
    }
}
