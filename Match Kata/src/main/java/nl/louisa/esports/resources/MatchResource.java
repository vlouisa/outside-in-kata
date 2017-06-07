package nl.louisa.esports.resources;

import nl.louisa.esports.domain.MatchRepository;
import nl.louisa.esports.domain.RegistrationService;
import nl.louisa.esports.domain.ReportingService;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/match")
public class MatchResource {

    @GET
    public List<MatchDTO> findAllSoccerMatches(){
        return new ReportingService(new MatchRepository()).findAllSoccerMatches();
    }

    @POST
    public Response registerMatch(MatchDTO matchDTO){
         new RegistrationService(new MatchRepository()).registerMatch(matchDTO);
        return Response.ok().build();
    }
}
