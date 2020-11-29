
public class Customer extends Person {

    private String customerId;
    private static int customerCount = 0;

    public Customer() {
        customerCount++;
    }

    public Customer(String name, String ic, String gender, String contact) {
        super(name, ic, gender, contact);
        customerCount++;
    }

    public Customer(String customerId, String name, 
            String ic, String gender, String contact) {
        super(name, ic, gender, contact);
        this.customerId = customerId;
        customerCount++;
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
        Customer.customerCount = customerCount;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerId=" + customerId + ", customerCount=" + customerCount + '}';
    }

}
