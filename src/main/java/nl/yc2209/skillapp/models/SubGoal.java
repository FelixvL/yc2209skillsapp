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
    private String SubGoalCounter;
    private String nameOfSubGoal;
    private String description;
    private int points;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSubGoalCounter() {
        return SubGoalCounter;
    }

    public void setSubGoalCounter(String subGoalCounter) {
        SubGoalCounter = subGoalCounter;
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