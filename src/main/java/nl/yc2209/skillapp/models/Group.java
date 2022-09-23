package nl.yc2209.skillapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Group {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String groupName;
	boolean goal;
	boolean subGoal;
	int points;
	int maxAmountMembers;
	
	
	public Group() {
	}


	public Group(Long id, String groupName, boolean goal, boolean subGoal, int points, int maxAmountMembers) {
		this.id = id;
		this.groupName = groupName;
		this.goal = goal;
		this.subGoal = subGoal;
		this.points = points;
		this.maxAmountMembers = maxAmountMembers;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public boolean isGoal() {
		return goal;
	}

	public void setGoal(boolean goal) {
		this.goal = goal;
	}

	public boolean isSubGoal() {
		return subGoal;
	}

	public void setSubGoal(boolean subGoal) {
		this.subGoal = subGoal;
	}

	public int getPoints() {
		return points;
	}


	public void setPoints(int points) {
		this.points = points;
	}

	public int getMaxAmountMembers() {
		return maxAmountMembers;
	}

	public void setMaxAmountMembers(int maxAmountMembers) {
		this.maxAmountMembers = maxAmountMembers;
	}
	
}
