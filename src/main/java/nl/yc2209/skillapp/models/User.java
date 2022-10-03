package nl.yc2209.skillapp.models;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class User {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private String name;
private String username;
private String email;
private String password;
private LocalDate accountCreation = LocalDate.now();
private Date dob;
private String location;
private int points;
private int goalProgress;
private int subGoalProgress;
private boolean Expert;

@ManyToMany
List<Goal> goal;

public User() {
}

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public LocalDate getAccountCreation() {return accountCreation;}
public void setAccountCreation(LocalDate accountCreation) {this.accountCreation = accountCreation;}
public Date getDob() {return dob;}
public void setDob(Date dob) {this.dob = dob;}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getPoints() {
	return points;
}
public void setPoints(int points) {
	this.points = points;
}
public int getGoalProgress() {
	return goalProgress;
}
public void setGoalProgress(int goalProgress) {
	this.goalProgress = goalProgress;
}
public int getSubGoalProgress() {
	return subGoalProgress;
}
public void setSubGoalProgress(int subGoalProgress) {
	this.subGoalProgress = subGoalProgress;
}
public boolean isExpert() {
	return Expert;
}
public void setExpert(boolean expert) {
	Expert = expert;
}

	public List<Goal> getGoal() {
		return goal;
	}

	public void setGoal(List<Goal> goal) {
		this.goal = goal;
	}
}
