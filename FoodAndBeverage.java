
public class FoodAndBeverage extends Product {

    private String category;
    //private int totalAmountSold;

    public FoodAndBeverage() {
    }

    public FoodAndBeverage(String category) {
        this.category = category;
    }

    public FoodAndBeverage(String prodID, String prodName, String category) {
        super(prodID, prodName);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FoodAndBeverage{" + "category=" + category + '}';
    }

}
