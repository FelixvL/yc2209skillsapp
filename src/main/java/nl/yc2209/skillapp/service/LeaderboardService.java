package nl.yc2209.skillapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeaderboardService {

    private final LeaderboardService leaderboardService;

    @Autowired
    public LeaderboardService(LeaderboardService leaderboardService) {this.leaderboardService = leaderboardService;}


}
