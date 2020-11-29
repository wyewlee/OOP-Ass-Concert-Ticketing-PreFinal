
public class Concert {

    private String venue;
    private String concertDate; // DD-MON-YYYY 
    private String concertTime; // 12:12pm

    public Concert() {
        venue = "Axiata Arena Bukit Jalil";
    }

    public Concert(String venue, String concertDate, String concertTime) {
        this.venue = venue;
        this.concertDate = concertDate;
        this.concertTime = concertTime;
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
        return "Concert{" + "venue=" + venue + ", concertDate=" + concertDate
                + ", concertTime=" + concertTime + '}';
    }

}
