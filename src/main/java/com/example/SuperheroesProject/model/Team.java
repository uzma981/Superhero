package com.example.SuperheroesProject.model;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Entity
public class Team {
    @Id
    private int team_id;

    private String name;

    private String objective;

    public int getTeam_id() {
        return team_id;
    }

    public void setTeam_id(int team_id) {
        this.team_id = team_id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Team{" +
                "team_id=" + team_id +
                ", name='" + name + '\'' +
                ", objective='" + objective + '\'' +
                ", team members='"+ getTeam+
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    @OneToMany(mappedBy = "team",fetch= FetchType.EAGER,cascade = CascadeType.ALL)
    List<Heroes> getTeam;

//create table team( team_id
    // int auto_incremenet primary key,
    // name varchar(15) not null), objective varchar(120) not null)
}
