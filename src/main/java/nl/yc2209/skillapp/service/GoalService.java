package nl.yc2209.skillapp.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import ExceptionHandler.RecordNotFoundException;
import nl.yc2209.skillapp.repository.SubGoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.yc2209.skillapp.models.Goal;
import nl.yc2209.skillapp.models.Image;
import nl.yc2209.skillapp.repository.GoalRepository;
import nl.yc2209.skillapp.repository.ImageRepository;

@Service
public class GoalService {
	
	private final GoalRepository goalRepository;
	private final SubGoalRepository subGoalRepository;
	private final ImageRepository imageRepository;
	
	@Autowired
	public GoalService(GoalRepository goalRepository, SubGoalRepository subGoalRepository, ImageRepository imageRepository) {
		this.goalRepository = goalRepository;
		this.subGoalRepository = subGoalRepository;
		this.imageRepository = imageRepository;
	}

	public List<Goal> getAllGoals() {
		return goalRepository.findAll();
	}

	public void addNewGoal(Goal goal) {
		Image temp = goal.getImage();
		Image tempindb = imageRepository.save(temp);
		goalRepository.save(goal);
	}

	public Optional<Goal> getSingleGoal(Long id) {
		boolean exists = goalRepository.existsById(id);
		if (!exists) {
			throw new RecordNotFoundException("Dit goal bestaat niet (meer)");
		}
		Optional<Goal> goal = goalRepository.findById(id);
		return goal;
	}

	public void deleteGoal(Long id) {
		boolean bestaat = goalRepository.existsById(id);
		if (!bestaat) {
			throw new RecordNotFoundException("Dit Goal is niet gevonden");
		}
		goalRepository.deleteById(id);
	}


	public void assignSubGoalToGoal(Long subGoalId, Long id) {
		System.out.println("we gaan asignen");
		var optionalGoal = goalRepository.findById(id);
		var optionalSubGoal = subGoalRepository.findById(subGoalId);
		if (optionalGoal.isPresent() && optionalSubGoal.isPresent()) {
			var goal = optionalGoal.get();
			var subGoal = optionalSubGoal.get();
			goal.getSubGoal().add(subGoal);
			goalRepository.save(goal);
		}
	}

	public void deAssignSubGoalToGoal(Long subGoalId, Long id) {
		System.out.println("we gaan asignen");
		var optionalGoal = goalRepository.findById(id);
		var optionalSubGoal = subGoalRepository.findById(subGoalId);
		if (optionalGoal.isPresent() && optionalSubGoal.isPresent()) {
			var goal = optionalGoal.get();
			var subGoal = optionalSubGoal.get();

			goal.getSubGoal().remove(subGoal);
			goalRepository.save(goal);
		}
	}




}
