


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

public class Staff extends Person{
    
    private int staffId;
    private String staffPosition;
    private static int staffCount = 1000;
    private Person person;
    private Date dateCreated = new Date();
    
    
public Staff(){
    staffId = 0;
    staffPosition = "";
}


    public Staff(String name, String ic, String gender, String contact, String staffPosition) {
        super(name, ic, gender, contact);
        this.staffId = staffId;
        this.staffPosition = staffPosition;
        this.staffId = ++staffCount;
        this.dateCreated = new Date();
    }
    
    

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaffPosition() {
        return staffPosition;
    }

    public void setStaffPosition(String staffPosition) {
        this.staffPosition = staffPosition;
    }

    public static int getStaffCount() {
        return staffCount;
    }

    public static void setStaffCount(int staffCount) {
        Staff.staffCount = staffCount;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    
    
    @Override
    public String toString() {
                        return "\tStaff Id : " + staffId + "\n" +
                                "\tStaff Position : " + staffPosition + "\n" +
                                "\tDate and Time Created : " + dateCreated;
    }



}
