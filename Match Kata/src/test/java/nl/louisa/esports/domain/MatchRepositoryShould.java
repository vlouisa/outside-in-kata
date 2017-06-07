package nl.louisa.esports.domain;

import nl.louisa.esports.util.DateUtil;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MatchRepositoryShould {
    private MatchRepository matchRepository;

    @Before public void setUp() throws Exception {
        MatchRepository.soccerMatches = new ArrayList();
        matchRepository = new MatchRepository();
    }

    @Test public void
    return_all_of_the_soccer_matches() {
        matchRepository.add(DateUtil.stringToDate("18/05/2017"), new Team("PEC"), new Team("UTRECHT"));
        assertThat(matchRepository.findAll().size(), is(1));
    }

}