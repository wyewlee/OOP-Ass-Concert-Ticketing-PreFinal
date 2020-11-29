


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Customer extends Person{
    
    private String customerId;
    private static int customerCount;

    public Customer(){
        customerId = "";
        customerCount = 0;
    }
    
    public Customer(String name, String ic, String gender, String contact) {
        super(name, ic, gender, contact);
    }
    
 
    public Customer(String customerId, int customerCount, String name, String ic, String gender, String contact) {
        super(name, ic, gender, contact);
        this.customerId = customerId;
        this.customerCount = customerCount;
    }
    
 

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public static int getCustomerCount() {
        return customerCount;
    }

    public void setCustomerCount(int customerCount) {
        this.customerCount = customerCount;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerId=" + customerId + ", customerCount=" + customerCount + '}';
    }

    

    
    
}
