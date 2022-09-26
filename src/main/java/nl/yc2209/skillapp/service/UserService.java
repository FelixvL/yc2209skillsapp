package nl.yc2209.skillapp.service;

import java.util.List;
import java.util.Optional;

import ExceptionHandler.RecordNotFoundException;
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

	public void updateUser(Long id, User user) {
		Optional<User> optionalUser = userRepository.findById(id);
		if (optionalUser.isEmpty()) {
			throw new RecordNotFoundException("De gebruiker is niet gevonden");
		} else {

			User user1 = optionalUser.get();

			user1.setId(user.getId());
			user1.setName(user.getName());
			user1.setUsername(user.getUsername());
			user1.setEmail(user.getEmail());
			user1.setPassword(user.getPassword());
			user1.setAccountCreation(user.getAccountCreation());
			user1.setDob(user.getDob());
			user1.setLocation(user.getLocation());
			user1.setPoints(user.getPoints());
			user1.setGoalProgress(user.getGoalProgress());
			user1.setSubGoalProgress(user.getSubGoalProgress());
			user1.setExpert(user.isExpert());

			userRepository.save(user1);
		}
	}

    public void assignGoalToUser(Long goalId, Long id) {
		var optionalUser = userRepository.findById(id);
		var optionalGoal = goalRepository.findById(goalId);
		if (optionalUser.isPresent() && optionalGoal.isPresent()) {
			var user = optionalUser.get();
			var goal = optionalGoal.get();
			user.setGoal(goal);
			userRepository.save(user);
		}
    }
}
