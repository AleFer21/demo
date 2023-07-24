package com.example.services;

import com.example.entities.Admin;
import com.example.entities.Club;
import com.example.entities.User;
import com.example.repositories.AdminRepository;
import com.example.repositories.ClubRepository;
import com.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ClubRepository clubRepository;

    @Override
    public List<Admin> getAll() {
        return adminRepository.findAll();
    }

    @Override
    public void save(Admin admin) {
        adminRepository.save(admin);
    }

    @Override
    public void delete(Admin admin) {
        adminRepository.delete(admin);
    }

    @Override
    public Admin getById(Admin admin) {
        return adminRepository.findById(admin.getId()).orElse(null);
    }

    @Override
    public void unsubscribeUser(long id) {
        User user = userRepository.findById(id).get();
        user.setStatus(Boolean.FALSE);
        userRepository.save(user);
    }

    @Override
    public void unsubscribeClub(long id) {
        Club club = clubRepository.findById(id).get();
        club.setStatus(Boolean.FALSE);
        clubRepository.save(club);
    }
}
