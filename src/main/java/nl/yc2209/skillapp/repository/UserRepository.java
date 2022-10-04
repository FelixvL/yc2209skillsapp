package nl.yc2209.skillapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nl.yc2209.skillapp.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
	Optional<User> findUserByEmail(String email);
	Optional<User> findUserByUsername(String username);
}
