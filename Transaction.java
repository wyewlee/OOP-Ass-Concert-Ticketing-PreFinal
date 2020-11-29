
public class Transaction {

    private String transID;
    private String idCount;
    private boolean member;

    public Transaction() {
        transID = " ";
        idCount = " ";
        member = false;
    }

    public Transaction(String transactionID, String countID, boolean member) {
        transID = transactionID;
        idCount = countID;
        this.member = member;
    }

    public String getTransID() {
        return transID;
    }

    public void setTransID(String transactionID) {
        transID = transactionID;
    }

    public String getIdCount() {
        return idCount;
    }

    public void setIdCount(String idCount) {
        this.idCount = idCount;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String toString() {
        return String.format("%s %s %b", transID, idCount, member);
    }
}
