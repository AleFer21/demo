package com.example.services;

import com.example.entities.Club;
import com.example.repositories.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ClubServiceImpl implements ClubService {

    @Autowired
    private ClubRepository clubRepository;

    @Override
    @Transactional
    public List<Club> getAll() {
        return clubRepository.findAll();
    }

    @Override
    @Transactional
    public void save(Club club) {
        club.setStatus(Boolean.TRUE);
        clubRepository.save(club);
    }

    @Override
    @Transactional
    public void delete(long id) {
        clubRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Club getById(long id) {
        return clubRepository.findById(id).get();
    }
}
