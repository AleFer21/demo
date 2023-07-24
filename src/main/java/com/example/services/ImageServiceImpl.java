package com.example.services;

import com.example.entities.Image;
import com.example.repositories.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageRepository imageRepository;

    @Override
    @Transactional
    public List<Image> getAll() {
        return imageRepository.findAll();
    }

    @Override
    @Transactional
    public Image save(MultipartFile file) throws IOException {
        try {
            Image image = new Image();
            image.setMime(file.getContentType());
            image.setName(file.getName());
            image.setImage(file.getBytes());
            return imageRepository.save(image);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    @Override
    @Transactional
    public void delete(long id) {
        Image image = imageRepository.findById(id).get();
        imageRepository.delete(image);
    }

    @Override
    public Image getById(long id) {
        return imageRepository.findById(id).get();
    }
}
