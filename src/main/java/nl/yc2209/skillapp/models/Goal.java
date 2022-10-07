package nl.yc2209.skillapp.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Goal {

@Id
@GeneratedValue(strategy = GenerationType.AUTO) //suppose this generates a new ID each time obj is made
private long id;
private String nameOfGoal;
private String category;
private String description;
private int totalPoints;
//alt insert getters n setters

@ManyToMany
List<User> user;

@OneToMany
List<SubGoal> subGoal;

public Goal() {
}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNameOfGoal() {
		return nameOfGoal;
	}

	public void setNameOfGoal(String nameOfGoal) {
		this.nameOfGoal = nameOfGoal;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public List<SubGoal> getSubGoal() { return subGoal;}

	public void setSubGoal(List<SubGoal> subGoal) {this.subGoal = subGoal;}

}
