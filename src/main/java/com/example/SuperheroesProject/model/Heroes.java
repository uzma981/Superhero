package com.example.SuperheroesProject.model;

import jakarta.persistence.*;

@Entity
public class Heroes {
    @Id
    private int id;

    private String name;

    private String alias;


    private String superpower;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSuperPower() {
        return superpower;
    }

    public void setSuperPower(String superPower) {
        this.superpower = superPower;
    }



    @Override
    public String toString() {
        return "Heroes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", alias='" + alias + '\'' +
                ", superPower='" + superpower + '\'' +
                '}';
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    @ManyToOne
    @JoinColumn(name = "teamID")
    private Team team;




}
