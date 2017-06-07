package nl.louisa.esports.domain;

import nl.louisa.esports.resources.MatchDTO;
import nl.louisa.esports.util.DateUtil;

public class RegistrationService {
    private MatchRepository matchRepository;

    public RegistrationService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    public void registerMatch(MatchDTO matchDTO) {
        matchRepository.add(DateUtil.stringToDate(matchDTO.getDate()), new Team(matchDTO.getHome()), new Team(matchDTO.getVisitor()));
    }
}