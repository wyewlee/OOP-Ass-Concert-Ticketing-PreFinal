
public class Transaction {
    
    private static String transID;
    private static String idCount;
    private static boolean member;
    
    public Transaction(){
        transID = " ";
        idCount = " ";
        member = false;
    }
    
    public Transaction(String transactionID, String countID, boolean member){
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

    public void setIdCount(String iDCount) {
        idCount = iDCount;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean mEmber) {
        member = mEmber;
    }
    
    public String toString(){
        return String.format("%s %s %b", transID, idCount, member);
    }
    
    public static void main (String[] args) {
        Transaction trans = new Transaction();
    }
    
}
