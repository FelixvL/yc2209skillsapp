package nl.yc2209.skillapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	public List<User> getAllUser() {
		return userService.getAllUsers();
	}

	@PostMapping
	public void createUser(@RequestBody User user) {
		userService.addNewUser(user);
	}
		
}
