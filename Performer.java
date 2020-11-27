/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */



public class Performer extends Person{
    private String performerId;
    private String managingCompany;
    
    public Performer(){
        performerId = "";
        managingCompany = "";
    }

    public Performer(String name, String ic, String gender, String contact) {
        super(name, ic, gender, contact);
    }

    public Performer(String performerId, String managingCompany, String name, String ic, String gender, String contact) {
        super(name, ic, gender, contact);
        this.performerId = performerId;
        this.managingCompany = managingCompany;
    }

    public String getPerformerId() {
        return performerId;
    }

    public void setPerformerId(String performerId) {
        this.performerId = performerId;
    }

    public String getManagingCompany() {
        return managingCompany;
    }

    public void setManagingCompany(String managingCompany) {
        this.managingCompany = managingCompany;
    }

    @Override
    public String toString() {
        return "Performer{" + "performerId=" + performerId + ", managingCompany=" + managingCompany + '}';
    }
    

    
}
