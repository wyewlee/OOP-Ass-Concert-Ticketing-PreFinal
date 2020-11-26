/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Person {
    
    private String name;
    private String ic;
    private char gender;
    private String contact;
    
     public Person(String name, String ic, char gender, String contact){
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
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
