package nl.yc2209.skillapp.controllers;

import java.util.List;

import nl.yc2209.skillapp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import nl.yc2209.skillapp.models.Goal;
import nl.yc2209.skillapp.service.GoalService;


@RestController
@RequestMapping(value = "goals")
public class GoalController {

    private final GoalService goalService;

    @Autowired
    public GoalController(GoalService goalService) {
        this.goalService = goalService;
    }

    @GetMapping
    public List<Goal> getAllGoal() {
        return goalService.getAllGoals();
    }

    @GetMapping(value = "/id/{id}")
    public Goal getSingleGoal(@PathVariable("id") Long id) {
        return goalService.getSingleGoal(id).get();
    }

    @DeleteMapping(value = "/{id}")
    public void deleteGoal(@PathVariable("id") Long id) {
        System.out.println("delete goal");
        goalService.deleteGoal(id);
    }

    @PostMapping
    public void createGoal(@RequestBody Goal goal) {
        System.out.println("go " + goal);
        goalService.addNewGoal(goal);
    }

    @PutMapping("/{id}/{subGoalId}")
    public void assignSubGoalToGoal(@PathVariable("id") Long id, @PathVariable("subGoalId") Long subGoalId) {
        goalService.assignSubGoalToGoal(subGoalId, id);
    }

    @DeleteMapping("/{id}/{SubGoalId}")
    public void deAssignSubGoalToGoal(@PathVariable("id") Long id, @PathVariable("SubGoalId") Long goalId) {
        goalService.deAssignSubGoalToGoal(goalId, id);
    }

}
