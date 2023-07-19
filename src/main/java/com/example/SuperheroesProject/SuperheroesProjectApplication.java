package com.example.SuperheroesProject;

import com.example.SuperheroesProject.model.Heroes;
import com.example.SuperheroesProject.model.Team;
import com.example.SuperheroesProject.repository.HeroRepository;
import com.example.SuperheroesProject.repository.TeamRepository;
import com.example.SuperheroesProject.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SuperheroesProjectApplication implements CommandLineRunner {
//	@Autowired
//	TeamRepository r;
//
	@Autowired
	TeamService s;
//
//	@Autowired
//	HeroRepository h;


	public static void main(String[] args) {
		SpringApplication.run(SuperheroesProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		List<Heroes> listOfHeroes = h.findAll();
//		System.out.println(listOfHeroes);
//		List<Team> listOfTeam = r.findAll();
//		System.out.println(listOfTeam);
//
//		List<Heroes> listOfHeroes = h.findAll();
//		System.out.println(listOfHeroes);
//
//		// Retrieve the team by ID or name
//		Team team = r.findById(2).orElse(null);
//
////		s.findByTeam();
		List<Team> t = s.getAllTeam();
		for(Team m : t){
			System.out.println(m);
		}
c












	}
}
