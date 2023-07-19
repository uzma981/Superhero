package com.example.SuperheroesProject.service;

import com.example.SuperheroesProject.model.Heroes;
import com.example.SuperheroesProject.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroService {
    @Autowired
    HeroRepository heroRepo;

    public List<Heroes> getAllHeroes(){
        return heroRepo.findAll();
    }


}
