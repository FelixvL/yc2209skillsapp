package nl.yc2209.skillapp.service;

import java.util.List;

import nl.yc2209.skillapp.repository.SubGoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.yc2209.skillapp.models.Goal;
import nl.yc2209.skillapp.repository.GoalRepository;

@Service
public class GoalService {
	
	private final GoalRepository goalRepository;
	private final SubGoalRepository subGoalRepository;
	
	@Autowired
	public GoalService(GoalRepository goalRepository, SubGoalRepository subGoalRepository) {
		this.goalRepository = goalRepository;
		this.subGoalRepository = subGoalRepository;
	}

	public List<Goal> getAllGoals() {
		return goalRepository.findAll();
	}

	public void addNewGoal(Goal goal) {		
		goalRepository.save(goal);
	}


	public void assignSubGoalToGoal(Long subGoalId, Long id) {
		System.out.println("we gaan asignen");
		var optionalGoal = goalRepository.findById(id);
		var optionalSubGoal = subGoalRepository.findById(subGoalId);
		if (optionalGoal.isPresent() && optionalSubGoal.isPresent()) {
			var goal = optionalGoal.get();
			var subGoal = optionalSubGoal.get();
//			user.setGoal((List<Goal>) goal);
			goal.getSubGoal().add(subGoal);
			goalRepository.save(goal);
		}
	}

}
