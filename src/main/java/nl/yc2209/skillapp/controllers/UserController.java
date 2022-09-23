package nl.yc2209.skillapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
	
	@GetMapping(value = "/{username}")
	public User getSingleUser(@PathVariable("username") Long id) {
		return userService.getSingleUser(id).get();
	}
	
	@PostMapping
	public void createUser(@RequestBody User user) {
		userService.addNewUser(user);
	}
	
	@DeleteMapping(value = "/{id}")
	public void deleteUser(@PathVariable("id") Long id) {
		userService.deleteUser(id);
	}
	
		
}
