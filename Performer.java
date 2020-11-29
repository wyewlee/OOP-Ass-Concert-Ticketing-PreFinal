
import java.util.Date;




public class Performer extends Person{
    private int performerId;
    private static int performerCount = 1000;
    private String managingCompany;
    private Person person;
    private Date dateCreated = new Date();

    
    public Performer(){
        performerId = 0;
        managingCompany = "";
    }


    public Performer(String name, String ic, String gender, String contact, String managingCompany) {
        super(name, ic, gender, contact);
        this.performerId = performerId;
        this.performerId = ++performerCount;
        this.managingCompany = managingCompany;
        this.dateCreated = new Date();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getPerformerId() {
        return performerId;
    }

    public void setPerformerId(int performerId) {
        this.performerId = performerId;
    }

    public int getPerformerCount() {
        return performerCount;
    }

    public void setPerformerCount(int performerCount) {
        this.performerCount = performerCount;
    }

 

    public String getManagingCompany() {
        return managingCompany;
    }

    public void setManagingCompany(String managingCompany) {
        this.managingCompany = managingCompany;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    
    

    @Override
    public String toString() {
                return "\tPerformer Id : " + performerId + "\n" +
                        "\tManaging Company : " + managingCompany + "\n" +
                        "\tDate and Time Created : " + dateCreated;
    }

    


    

    
}
