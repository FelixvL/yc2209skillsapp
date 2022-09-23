package nl.yc2209.skillapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ExceptionHandler.EmailAlreadyTakenExeption;
import ExceptionHandler.UserNotFoundExeption;
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
	
	public Optional<User> getSingleUser(Long id) {
		boolean exists = userRepository.existsById(id);
		if (!exists) {
			throw new UserNotFoundExeption(id);
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
			throw new UserNotFoundExeption(id);
		}
		userRepository.deleteById(id);
	}

	



}
