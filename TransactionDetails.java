
public class TransactionDetails extends Transaction {

    private double totalPrice;
    private double memberDiscount;
    private double totalPayment; //?

    public TransactionDetails() {
        totalPrice = 0.00;
        memberDiscount = 0.00;
        totalPayment = 0.00;
    }

    public TransactionDetails(String transactionID, String countID, boolean member) {
        super(transactionID, countID, member);
    }

    public TransactionDetails(double priceAmount, double discount, double totalPay) {
        totalPrice = priceAmount;
        memberDiscount = discount;
        totalPayment = totalPay;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPRICE) {
        totalPrice = totalPRICE;
    }

    public double getMemberDiscount() {
        return memberDiscount;
    }

    public void setMemberDiscount(double memberDisc) {
        memberDiscount = memberDisc;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPay) {
        totalPayment = totalPay;
    }

    public String toString() {
        return String.format("%.2f %.2f %.2f", totalPrice, memberDiscount, totalPayment);
    }

}
