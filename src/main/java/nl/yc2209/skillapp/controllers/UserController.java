package nl.yc2209.skillapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.yc2209.skillapp.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/user")
	public void postUser() {
		
	}
	
	@GetMapping("/users")
	public void getUsers() {
		
	}
	
		
}
