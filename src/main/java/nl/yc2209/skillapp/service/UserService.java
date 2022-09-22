package nl.yc2209.skillapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.yc2209.skillapp.models.User;
import nl.yc2209.skillapp.repository.UserRepository;

@Service
public class UserService {
	
	private final UserRepository userRepository;
	
	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public void addNewUser(User user) {		
		userRepository.save(user);
	}

}
