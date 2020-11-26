


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Staff extends Person{
    
    private String staffId;
    private String staffPosition;
    private int staffCount;
    
    


    public Staff(String name, String ic, char gender, String contact) {
        super(name, ic, gender, contact);
    }

    
    public Staff(String staffId, String staffPosition, int staffCount, String name, String ic, char gender, String contact) {
        super(name, ic, gender, contact);
        this.staffId = staffId;
        this.staffPosition = staffPosition;
        this.staffCount = staffCount;
    }
    


    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffPosition() {
        return staffPosition;
    }

    public void setStaffPosition(String staffPosition) {
        this.staffPosition = staffPosition;
    }

    public int getStaffCount() {
        return staffCount;
    }

    public void setStaffCount(int staffCount) {
        this.staffCount = staffCount;
    }

    @Override
    public String toString() {
        return "Staff{" + "staffId=" + staffId + ", staffPosition=" + staffPosition + ", staffCount=" + staffCount + '}';
    }

    

    
    
}
