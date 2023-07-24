package com.example.services;

import com.example.entities.Club;
import java.util.List;

public interface ClubService {

    public List<Club> getAll();

    public void save(Club club);

    public void delete(long id);

    public Club getById(long id);

}
