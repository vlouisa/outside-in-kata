package nl.louisa.esports.domain;

import nl.louisa.esports.resources.MatchDTO;
import nl.louisa.esports.util.DateUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class RegistrationServiceShould {
    private RegistrationService registrationService;
    @Mock private MatchRepository matchRepository;

    @Before
    public void setUp() throws Exception {
        registrationService = new RegistrationService(matchRepository);
    }

    @Test public void
    store_a_match() {
        registrationService.registerMatch(new MatchDTO("01/01/2017", "KNUDDE", "CAMBUUR"));
        verify(matchRepository).add(DateUtil.stringToDate("01/01/2017"), new Team("KNUDDE"), new Team("CAMBUUR"));
    }
}