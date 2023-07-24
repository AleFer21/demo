package com.example.services;

import com.example.entities.Admin;
import java.util.List;

public interface AdminService {

    public List<Admin> getAll();

    public void save(Admin admin);

    public void delete(Admin admin);

    public Admin getById(Admin admin);

    public void unsubscribeUser(long id);

    public void unsubscribeClub(long id);

}
