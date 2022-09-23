package nl.yc2209.skillapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import nl.yc2209.skillapp.models.Goal;
import nl.yc2209.skillapp.service.GoalService;


@RestController
@RequestMapping(value = "goals")
public class GoalController {
	

	private final GoalService goalService; //geeft has-a relatie aan

	@Autowired
	public GoalController(GoalService goalService) {this.goalService = goalService;	}

	@GetMapping
	public List<Goal> getAllGoal() {
		return goalService.getAllGoals(); //waarom is het in de service functie meervoud en in de functie van deze controller niet?
	}

	@PostMapping
	public void createGoal(@RequestBody Goal goal) {
		goalService.addNewGoal(goal);
	}
		
}
