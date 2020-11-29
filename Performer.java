
public class Performer extends Person {

    private String performerId;
    private String managingCompany;
    private static int performerCount = 0;

    public Performer() {
        performerCount++;
    }

    public Performer(String name, String ic, String gender, String contact) {
        super(name, ic, gender, contact);
        performerCount++;
    }

    public Performer(String performerId, String managingCompany, String name,
            String ic, String gender, String contact) {
        super(name, ic, gender, contact);
        this.performerId = performerId;
        this.managingCompany = managingCompany;
        performerCount++;
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

    public static int getPerformerCount() {
        return performerCount;
    }

    public static void setPerformerCount(int performerCount) {
        Performer.performerCount = performerCount;
    }

    @Override
    public String toString() {
        return "Performer{" + "performerId=" + performerId + ", managingCompany=" + managingCompany + '}';
    }

}
