package nl.yc2209.skillapp.models;

import javax.persistence.Entity;


import javax.persistence.*; //so this replaces the javax.persistence for several other '@' here.

@Entity
public class SubGoal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;
    String nameOfSubGoal;
    String description;
    int points;


}
