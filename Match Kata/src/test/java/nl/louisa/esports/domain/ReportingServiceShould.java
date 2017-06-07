package nl.louisa.esports.domain;

import nl.louisa.esports.resources.MatchDTO;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ReportingServiceShould {
    @Mock private MatchRepository matchRepository;
    private ReportingService reportingService;
    public static final String DATE = "01/01/2017";
    public static final String HOME = "NEC";
    public static final String VISITOR = "NAC";

    @Before
    public void setUp() throws Exception {
        reportingService = new ReportingService(matchRepository);
    }

    @Test public void
    use_match_repository_on_findListOfAllSoccerMatches() {
        reportingService.findAllSoccerMatches();
        verify(matchRepository).findAll();
    }

    @Test public void
    map_matches_to_dto() {

        List<SoccerMatch> matches = Arrays.asList(
                new SoccerMatch("XXXXX", toDate(DATE), new Team(HOME), new Team(VISITOR) )
        );
        given(matchRepository.findAll()).willReturn(matches);

        List<MatchDTO> matchDTOList = Arrays.asList(
                new MatchDTO(DATE, HOME, VISITOR)
        );
        assertThat(reportingService.findAllSoccerMatches(), is(matchDTOList));


    }

    private Date toDate(String date) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException e) {
            return null;
        }

    }


}