package com.example.SuperheroesProject.service;


import com.example.SuperheroesProject.model.Heroes;
import com.example.SuperheroesProject.model.Team;
import com.example.SuperheroesProject.repository.HeroRepository;
import com.example.SuperheroesProject.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {
    @Autowired
    TeamRepository teamRepo;

    @Autowired
    HeroRepository h;

    public List<Team> getAllTeam(){
        return teamRepo.findAll();
    }



    public Team getOneById(int id){
        if(id>0){
            Optional<Team> opt = teamRepo.findById(id);
            return opt.orElse(new Team());
        }
        return new Team();

    }
    //for every team print out the heroes that belong to that team.
    public void findByTeam(){
        List<Team> listOfTeams = teamRepo.findAll();
        for (Team team : listOfTeams) {
            System.out.println("Heroes in team " + team.getName() + ":");
            List<Heroes> heroes = h.findAll();
            for (Heroes hero : heroes) {
                System.out.println(hero);
            }
            System.out.println("----------------------");
        }
    }
}
