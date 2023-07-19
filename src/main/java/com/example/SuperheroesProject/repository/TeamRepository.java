package com.example.SuperheroesProject.repository;

import com.example.SuperheroesProject.model.Heroes;
import com.example.SuperheroesProject.model.Team;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TeamRepository extends  JpaRepository<Team, Integer> {

}



