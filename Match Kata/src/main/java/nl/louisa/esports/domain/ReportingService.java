package nl.louisa.esports.domain;

import nl.louisa.esports.resources.MatchDTO;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class ReportingService {
    private MatchRepository matchRepository;

    public ReportingService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    public List<MatchDTO> findAllSoccerMatches() {
        List<SoccerMatch> soccerMatches = matchRepository.findAll();
        return soccerMatches.stream()
                    .map( soccerMatch -> mapToDTO(soccerMatch))
                    .collect(toList());
    }

    private MatchDTO mapToDTO(SoccerMatch soccerMatch) {
        return new MatchDTO(dateToString(soccerMatch.getDate()),
                            soccerMatch.getHomeTeam().getName(),
                            soccerMatch.getVisitingTeam().getName()
                );


    }

    private String dateToString(Date date) {
        return new SimpleDateFormat("dd/MM/yyyy").format(date);
    }
}
