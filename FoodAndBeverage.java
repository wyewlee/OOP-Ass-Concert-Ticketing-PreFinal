
public class FoodAndBeverage extends Product {

    private String category;
    private double unitPrice;

    public FoodAndBeverage() {
    }

    public FoodAndBeverage(String category, double unitPrice) {
        this.category = category;
        this.unitPrice = unitPrice;
    }

    public FoodAndBeverage(String prodID, String prodName, String category, Double unitPrice) {
        super(prodID, prodName);
        this.category = category;
        this.unitPrice = unitPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return super.toString() +"FoodAndBeverage{" + "category=" + category + ", unitPrice=" + unitPrice + '}';
    }

    
    

}
