package nl.yc2209.skillapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SubGoal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    long id;
    String nameOfSubGoal;
    String description;
    int points;


    public SubGoal(long id, String nameOfSubGoal, String description, int points)
    {
        this.id = id;
        this.nameOfSubGoal = nameOfSubGoal;
        this.description = description;
        this.points = points;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;

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


}
