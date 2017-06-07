package nl.louisa.esports.resources;

public class MatchDTO {
    private  String date;
    private  String home;
    private  String visitor;

    public MatchDTO(){
        this(null, null, null);
    }

    public MatchDTO(String date, String home, String visitor) {
        this.date = date;
        this.home = home;
        this.visitor = visitor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getVisitor() {
        return visitor;
    }

    public void setVisitor(String visitor) {
        this.visitor = visitor;
    }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MatchDTO matchDTO = (MatchDTO) o;

        if (date != null ? !date.equals(matchDTO.date) : matchDTO.date != null) return false;
        if (home != null ? !home.equals(matchDTO.home) : matchDTO.home != null) return false;
        return visitor != null ? visitor.equals(matchDTO.visitor) : matchDTO.visitor == null;
    }

    @Override public int hashCode() {
        int result = date != null ? date.hashCode() : 0;
        result = 31 * result + (home != null ? home.hashCode() : 0);
        result = 31 * result + (visitor != null ? visitor.hashCode() : 0);
        return result;
    }

    @Override public String toString() {
        return "MatchDTO{" +
                "date='" + date + '\'' +
                ", home='" + home + '\'' +
                ", visitor='" + visitor + '\'' +
                '}';
    }
}
