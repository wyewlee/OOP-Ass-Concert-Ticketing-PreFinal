import java.util.Date;

public class Concert {
    
    private Date dateCreated = new Date();
    protected String venue;
    
    public Concert(){
        venue = "Axiata Arena Bukit Jalil";
    }
    
    public Concert(String venue){
        this.venue = venue;
        this.dateCreated = new Date();
    }
    
    public Date getDateCreated() {
        return dateCreated;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String vEnue) {
        venue = vEnue;
    }
    
    @Override
    public String toString(){
        return "\tVenue : " + venue + "\n" +
                "\tDate & Time : " + dateCreated;
    }
    
    public static void main(String[]args){
        
    }
}
