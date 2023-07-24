package com.example.services;

import com.example.entities.Comment;
import com.example.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    @Transactional
    public List<Comment> getAll() {
        return commentRepository.findAll();
    }

    @Override
    @Transactional
    public void save(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    @Transactional
    public void delete(long id) {
        commentRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Comment getById(long id) {
        return commentRepository.findById(id).get();
    }

}
