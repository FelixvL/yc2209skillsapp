package nl.yc2209.skillapp.service;

import nl.yc2209.skillapp.repository.GroupRepository;
import nl.yc2209.skillapp.repository.SubGoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubGoalService {

    @Autowired
    private SubGoalRepository subGoalRepository;
    //private final GroupRepository groupRepository;

    @Autowired
    public SubGoalService(){}




}
