package features;

import nl.louisa.esports.domain.MatchRepository;
import nl.louisa.esports.domain.RegistrationService;
import nl.louisa.esports.domain.ReportingService;
import nl.louisa.esports.resources.MatchDTO;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ShowListOfMatchesFeature {
    public static final MatchDTO FEY_EXC = new MatchDTO("01/07/2017", "FEYENOORD", "EXCELSIOR");
    public static final MatchDTO AJX_PSV = new MatchDTO("01/07/2017", "AJAX", "PSV");
    private RegistrationService registrationService;
    private ReportingService reportingService;
    private MatchRepository matchRepository;

    @Before
    public void setUp() throws Exception {
        MatchRepository.soccerMatches = new ArrayList();
        matchRepository = new MatchRepository();
        registrationService = new RegistrationService(matchRepository);
        reportingService = new ReportingService(matchRepository);
    }

    @Test public void
    show_list_containing_matches() {
        registrationService.registerMatch(FEY_EXC);
        registrationService.registerMatch(AJX_PSV);

        List<MatchDTO> matchDTOList = Arrays.asList(
                FEY_EXC,
                AJX_PSV
        );
        assertThat(reportingService.findAllSoccerMatches(), is(matchDTOList));

    }

}
