package nl.yc2209.skillapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.yc2209.skillapp.models.Group;
import nl.yc2209.skillapp.service.GroupService;

@RestController
@RequestMapping(value = "group")
public class GroupController {
	
	private final GroupService groupService;
	
	@Autowired
	public GroupController(GroupService groupService) {
		this.groupService = groupService;
	}

	@PostMapping
	public void createGroup(@RequestBody Group group) {
		groupService.addNewGroup(group);
	}
	
}
