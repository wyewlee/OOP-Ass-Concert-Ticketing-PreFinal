
public class Person {

    private String name;
    private String ic;
    private String gender;
    private String contact;

    public Person() {
    }

    public Person(String name, String ic, String gender, String contact) {
        this.name = name;
        this.ic = ic;
        this.gender = gender;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", ic=" + ic + ", gender=" + gender + ", contact=" + contact + '}';
    }



}
