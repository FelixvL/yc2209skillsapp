package nl.yc2209.skillapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nl.yc2209.skillapp.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
