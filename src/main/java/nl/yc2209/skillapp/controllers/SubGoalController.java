package nl.yc2209.skillapp.controllers;



import nl.yc2209.skillapp.models.SubGoal;
import nl.yc2209.skillapp.service.SubGoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "subGoal")
public class SubGoalController {

    private final SubGoalService subGoalService;

    @Autowired
    public SubGoalController(SubGoalService subGoalService) {
        this.subGoalService = subGoalService;
    }

    @GetMapping
    public List<SubGoal> getAllSubGoal() {
        return subGoalService.getAllSubGoals();
    }

    @PostMapping
    public Long createSubGoal(@RequestBody SubGoal subGoal) {
        return subGoalService.addNewSubGoal(subGoal);
    }
}
