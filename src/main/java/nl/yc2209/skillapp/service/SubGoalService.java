package nl.yc2209.skillapp.service;


import nl.yc2209.skillapp.models.SubGoal;
import nl.yc2209.skillapp.repository.SubGoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class SubGoalService {

    private final SubGoalRepository subGoalRepository;

    @Autowired
    public SubGoalService(SubGoalRepository subGoalRepository) {this.subGoalRepository = subGoalRepository;}

    public List<SubGoal> getAllSubGoals() {return subGoalRepository.findAll();}

    public void addNewSubGoal(SubGoal subGoal) {subGoalRepository.save(subGoal);}

}
