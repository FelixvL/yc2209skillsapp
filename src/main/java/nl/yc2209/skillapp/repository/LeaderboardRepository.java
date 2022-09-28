package nl.yc2209.skillapp.repository;

import nl.yc2209.skillapp.models.Leaderboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaderboardRepository extends JpaRepository <Leaderboard, Long> {

}
