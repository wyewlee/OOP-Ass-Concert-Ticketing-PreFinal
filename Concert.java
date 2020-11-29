
public class Concert {

    private String venue;
    private String concertName;
    private String concertDate; // DD-MON-YYYY 
    private String concertTime; // 12:12pm

    public Concert() {
        venue = "Axiata Arena Bukit Jalil";
    }

    public Concert(String name, String venue, String concertDate, String concertTime) {
        this.concertName = name;
        this.venue = venue;
        this.concertDate = concertDate;
        this.concertTime = concertTime;
    }

    public String getConcertName() {
        return concertName;
    }

    public void setConcertName(String name) {
        this.concertName = name;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getConcertDate() {
        return concertDate;
    }

    public void setConcertDate(String concertDate) {
        this.concertDate = concertDate;
    }

    public String getConcertTime() {
        return concertTime;
    }

    public void setConcertTime(String concertTime) {
        this.concertTime = concertTime;
    }

    @Override
    public String toString() {
        return "Concert{" + "venue=" + venue + ", concertName="
                + concertName + ", concertDate=" + concertDate
                + ", concertTime=" + concertTime + '}';
    }

}
