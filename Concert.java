/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Date;

public class Concert {
    
    private String name;
    private Date dateCreated = new Date();
    protected String venue;
    
    public Concert(){
        name = "";
        venue = "Axiata Arena Bukit Jalil";
    }
    
    public Concert(String name, String venue){
        this.name = name;
        this.venue = venue;
        this.dateCreated = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "\tName : " + name + "\n" +
                "\tVenue : " + venue + "\n" +
                "\tDate & Time : " + dateCreated;
    }
    
    public static void main(String[]args){
        
    }
}
