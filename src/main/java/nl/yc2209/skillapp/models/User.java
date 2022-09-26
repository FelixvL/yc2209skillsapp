package nl.yc2209.skillapp.models;

import org.w3c.dom.ls.LSOutput;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class User {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
long id;
String name;
String username;
String email;
String password;
Date accountCreation;
Date dob;
String location;
int points;
int goalProgress;
int subGoalProgress;
boolean Expert;

@OneToMany
List<Goal> goal;

public User() {
}

public User(long id, String name, String username, String email, String password, Date accountCreation, Date dob,

		String location, int points, int goalProgress, int subGoalProgress, boolean expert) {

	this.id = id;
	this.name = name;
	this.username = username;
	this.email = email;
	this.password = password;
	this.accountCreation = accountCreation;
	this.dob = dob;
	this.location = location;
	this.points = points;
	this.goalProgress = goalProgress;
	this.subGoalProgress = subGoalProgress;
	Expert = expert;
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
public Date getAccountCreation() {
	return accountCreation;
}
public void setAccountCreation(Date accountCreation) {
	this.accountCreation = accountCreation;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
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
