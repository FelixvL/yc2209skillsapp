package nl.yc2209.skillapp.models;

import javax.persistence.*;
//so this replaces the javax.persistence for several other '@' here

@Entity
public class SubGoal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    String nameOfSubGoal;
    String description;
    int points;

    @ManyToOne
    Goal goal; //hoe weet het waar het goal class vandaan moet halen?

    //@ManyToMany
    //active users


    //Leaderboard leaderboard

    public SubGoal(String nameOfSubGoal, String description, int points){ //hier geen id in constructor gemaakt omdat het auto generated is. is dat oke?
        this.nameOfSubGoal = nameOfSubGoal;
        this.description = description;
        this.points = points;
    }

    public long getId() { // I excluded the setter for Ids get generated automatically
        return id;
    }

    public String getNameOfSubGoal() {
        return nameOfSubGoal;
    }

    public void setNameOfSubGoal(String nameOfSubGoal) {
        this.nameOfSubGoal = nameOfSubGoal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Goal getGoal() {
        return goal;
    }

    public void setGoal(Goal goal) {
        this.goal = goal;
    }




//no touchy
}
