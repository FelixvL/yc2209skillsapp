package nl.yc2209.skillapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.yc2209.skillapp.models.Group;
import nl.yc2209.skillapp.repository.GroupRepository;

@Service
public class GroupService {
	
	private final GroupRepository groupRepository;
	
	@Autowired
	public GroupService(GroupRepository groupRepository) {
		this.groupRepository = groupRepository;
	}

	public void addNewGroup(Group group) {
		groupRepository.save(group);
		
	}

}
