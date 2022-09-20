package nl.yc2209.skillapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.yc2209.skillapp.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

}
