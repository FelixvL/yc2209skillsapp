package nl.yc2209.skillapp.models;

import javax.persistence.*;

@Entity
public class Goal {

@Id
@GeneratedValue(strategy = GenerationType.AUTO) //suppose this generates a new ID each time obj is made
long id;
String nameOfGoal;
String category;
String description;
int totalPoints;
//alt insert getters n setters

@ManyToOne
User user;

public Goal() {
}

public Goal(long id, String nameOfGoal, String category, String description, int totalPoints) {
	super();
	this.id = id;
	this.nameOfGoal = nameOfGoal;
	this.category = category;
	this.description = description;
    this.totalPoints = totalPoints;
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

public String getCategory(){
	return category;
}

public void setCategory(String category){
	this.category = category;
}

public String getDescription(){
	return description;
}

public void setDescription(String description){
	this.description = description;
}

public int getTotalPoints(){
	return totalPoints;
}

public void setTotalPoints(){
	this.totalPoints = totalPoints;
}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
