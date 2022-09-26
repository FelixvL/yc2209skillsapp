package nl.yc2209.skillapp.service;


import java.util.List;
import java.util.Optional;

import ExceptionHandler.RecordNotFoundException;
import nl.yc2209.skillapp.models.Goal;
import nl.yc2209.skillapp.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ExceptionHandler.EmailAlreadyTakenExeption;
import nl.yc2209.skillapp.models.User;
import nl.yc2209.skillapp.repository.UserRepository;

@Service
public class UserService {
	
	private final UserRepository userRepository;
	private final GoalRepository goalRepository;
	
	@Autowired
	public UserService(UserRepository userRepository, GoalRepository goalRepository) {
		this.userRepository = userRepository;
		this.goalRepository = goalRepository;
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	public Optional<User> getSingleUser(Long id) {
		boolean exists = userRepository.existsById(id);
		if (!exists) {
			throw new RecordNotFoundException("De gebruiker is niet gevonden");
		}
		Optional<User> user = userRepository.findById(id);
		return user;
	}
	
	public void addNewUser(User user) {		
		Optional<User> userByEmail = userRepository.findUserByEmail(user.getEmail());
		if (userByEmail.isPresent()) {
			throw new EmailAlreadyTakenExeption("email is al in gebruik");
		}
		userRepository.save(user);
	}

	public void deleteUser(Long id) {
		boolean exists = userRepository.existsById(id);
		if (!exists) {
			throw new RecordNotFoundException("De gebruiker is niet gevonden");
		}
		userRepository.deleteById(id);
	}

	public void updateUser(Long id, User newUser) {
		Optional<User> optionalUser = userRepository.findById(id);
		if(optionalUser.isEmpty()) {
			throw new RecordNotFoundException("userdata does not exist");
		} else {
			userRepository.save(newUser);
		}
	}

    public void assignGoalToUser(Long goalId, Long id) {
		var optionalUser = userRepository.findById(id);
		var optionalGoal = goalRepository.findById(goalId);
		if (optionalUser.isPresent() && optionalGoal.isPresent()) {
			var user = optionalUser.get();
			var goal = optionalGoal.get();
			user.setGoal((List<Goal>) goal);
			userRepository.save(user);
		}
    }
}
