package com.example.services;

import com.example.entities.Image;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface ImageService {

    public List<Image> getAll();

    public Image save(MultipartFile file) throws IOException;

    public void delete(long id);

    public Image getById(long id);

}
