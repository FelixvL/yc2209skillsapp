package nl.yc2209.skillapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.yc2209.skillapp.models.Goal;
import nl.yc2209.skillapp.repository.GoalRepository;

@Service
public class GoalService {
	
	private final GoalRepository goalRepository;
	
	@Autowired
	public GoalService(GoalRepository goalRepository) {
		this.goalRepository = goalRepository;
	}

	public List<Goal> getAllGoals() {
		return goalRepository.findAll();
	}

	public void addNewGoal(Goal goal) {		
		goalRepository.save(goal);
	}

}
