package com.example.services;

import com.example.entities.Comment;
import java.util.List;

public interface CommentService {

    public List<Comment> getAll();

    public void save(Comment comment);

    public void delete(long id);

    public Comment getById(long id);

}
