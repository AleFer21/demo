package com.example.services;

import com.example.entities.User;
import java.util.List;

public interface UserService {

    public List<User> getAll();

    public void save(User user);

    public void delete(long id);

    public User getById(long id);

}
