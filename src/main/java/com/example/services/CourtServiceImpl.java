package com.example.services;

import com.example.entities.Court;
import com.example.repositories.CourtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class CourtServiceImpl implements CourtService {

    @Autowired
    private CourtRepository courtRepository;

    @Override
    @Transactional
    public List<Court> getAll() {
        return courtRepository.findAll();
    }

    @Override
    @Transactional
    public void save(Court court) {
        courtRepository.save(court);
    }

    @Override
    @Transactional
    public void delete(long id) {
        courtRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Court getById(long id) {
        return courtRepository.findById(id).get();
    }

}
