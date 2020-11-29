
public class Product {

    private String prodID;
    private String prodName;
    //private double unitPrice;

    public Product() {
    }

    public Product(String prodID, String prodName) {
        this.prodID = prodID;
        this.prodName = prodName;
        //this.unitPrice = unitPrice;
    }

    public String getProdID() {
        return prodID;
    }

    public void setProdID(String prodID) {
        this.prodID = prodID;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

//    public double getUnitPrice() {
//        return unitPrice;
//    }
//
//    public void setUnitPrice(double unitPrice) {
//        this.unitPrice = unitPrice;
//    }
    public String toString() {
        return "Product{" + "prodID=" + prodID + ", prodName=" + prodName + '}';
    }

    //getSubTotal()
}
