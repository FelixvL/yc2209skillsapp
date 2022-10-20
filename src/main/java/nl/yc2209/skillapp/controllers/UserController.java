package nl.yc2209.skillapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import nl.yc2209.skillapp.models.User;
import nl.yc2209.skillapp.service.UserService;


@RestController
@RequestMapping(value = "users")
public class UserController {
	

	private final UserService userService;

	@Autowired
	public UserController(UserService userService) {
	this.userService = userService;
	}

	@GetMapping
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping(value = "/id/{id}")
	public User getSingleUser(@PathVariable("id") Long id) {
		return userService.getSingleUser(id).get();
	}

	@GetMapping(value = "/name/{username}")
	public User getUserByUsername(@PathVariable("username") String username){
		return userService.getUserByName(username).get();
	}

	@PostMapping
	public void createUser(@RequestBody User user) {
		userService.addNewUser(user);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteUser(@PathVariable("id") Long id) {
		userService.deleteUser(id);
	}

	@PutMapping("update/{id}")
	public void updateUser(@PathVariable Long id,@RequestBody User user) {
		userService.updateUser(id, user);
	}

	@PutMapping("/{id}/{goalId}")
	public void assignGoalToUser(@PathVariable("id") Long id, @PathVariable("goalId") Long goalId) {
		userService.assignGoalToUser(goalId, id);
	}

	@DeleteMapping("/{id}/{goalId}")
	public void deAssignGoalToUser(@PathVariable("id") Long id, @PathVariable("goalId") Long goalId) {
		userService.deAssignGoalToUser(goalId, id);
	}
		
}
