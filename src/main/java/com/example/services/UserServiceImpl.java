package com.example.services;

import com.example.entities.User;
import com.example.enums.Role;
import com.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public void save(User user) {
        user.setRole(Role.USER);
        user.setStatus(Boolean.TRUE);
        userRepository.save(user);
    }

    @Override
    @Transactional
    public void delete(long id) {
        userRepository.deleteById(id);
    }

    @Override
    @Transactional
    public User getById(long id) {
        return userRepository.findById(id).get();
    }
}
