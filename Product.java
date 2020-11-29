
public class Product {

    private String prodId;
    private String prodName;

    public Product() {
    }

    public Product(String prodId, String prodName) {
        this.prodId = prodId;
        this.prodName = prodName;

    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodID) {
        this.prodId = prodID;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String toString() {
        return "Product{" + "prodID=" + prodId + ", prodName=" + prodName + '}';
    }

}
