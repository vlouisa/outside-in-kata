package nl.louisa.esports.domain;

import java.util.Date;

public class SoccerMatch {
    private String id;
    private Date date;
    private Team homeTeam;
    private Team visitingTeam;

    public SoccerMatch(String id, Date date, Team homeTeam, Team visitingTeam) {
        this.id = id;
        this.date = date;
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
    }

    public String getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getVisitingTeam() {
        return visitingTeam;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SoccerMatch that = (SoccerMatch) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override public String toString() {
        return "SoccerMatch{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", homeTeam=" + homeTeam +
                ", visitingTeam=" + visitingTeam +
                '}';
    }
}
