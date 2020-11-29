
public class TestProg {

    public static void main(String args[]) {
        Ticket tickArr1[] = new Ticket[3];
        Ticket tickArr2[] = new Ticket[3];
        FoodAndBeverage fnbArr[] = new FoodAndBeverage[4];

        fnbArr[0] = new FoodAndBeverage("P1001", "French Fries + Coca-Cola", "Set", 7.00);
        fnbArr[1] = new FoodAndBeverage("P1002", "Donuts + 100 plus", "Set", 5.00);
        fnbArr[2] = new FoodAndBeverage("P1003", "Tuna Sandwhich + Sprite", "Set", 10.00);
        fnbArr[3] = new FoodAndBeverage("P1003", "Popcorn + Mineral Water", "Set", 6.00);

        tickArr1[0] = new Ticket("P1004", "BC One", true);
        tickArr1[1] = new Ticket("P1004", "BC One", true);
        tickArr1[2] = new Ticket("P1004", "BC One", false);

        tickArr2[0] = new Ticket("P1005", "JayC", true);
        tickArr2[1] = new Ticket("P1005", "JayC", false);
        tickArr2[2] = new Ticket("P1005", "JayC", true);

        

       
    }
}
