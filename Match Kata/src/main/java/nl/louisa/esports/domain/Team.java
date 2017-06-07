package nl.louisa.esports.domain;

public class Team {
    private String name;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team team = (Team) o;

        return name != null ? name.equals(team.name) : team.name == null;
    }

    @Override public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                '}';
    }
}
