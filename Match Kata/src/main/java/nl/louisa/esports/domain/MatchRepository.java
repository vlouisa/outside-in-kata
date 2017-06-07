package nl.louisa.esports.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class MatchRepository {

    public static List<SoccerMatch> soccerMatches = new ArrayList<>();

    public List<SoccerMatch> findAll() {
        return soccerMatches;
    }

    public void add(Date date, Team homeTeam, Team visitingTeam) {
        SoccerMatch soccerMatch = new SoccerMatch(UUID.randomUUID().toString(), date, homeTeam, visitingTeam);
        soccerMatches.add(soccerMatch);

    }
}
