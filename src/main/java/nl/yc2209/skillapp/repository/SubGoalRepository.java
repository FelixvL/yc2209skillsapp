package nl.yc2209.skillapp.repository;


import nl.yc2209.skillapp.models.SubGoal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubGoalRepository extends JpaRepository<SubGoal, Long> {


}
