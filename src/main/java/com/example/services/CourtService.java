package com.example.services;

import com.example.entities.Court;
import java.util.List;

public interface CourtService {

    public List<Court> getAll();

    public void save(Court court);

    public void delete(long id);

    public Court getById(long id);

}
