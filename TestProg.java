
public class TestProg {

    public static void main(String args[]) {
        Ticket tickArr1[] = new Ticket[3];
        Ticket tickArr2[] = new Ticket[3];
        FoodAndBeverage fnbArr[] = new FoodAndBeverage[3];

        fnbArr[0] = new FoodAndBeverage("P1001", "Popcorn", "Food", 5.00);
        fnbArr[1] = new FoodAndBeverage("P1002", "Cheesedog", "Food", 5.00);
        fnbArr[2] = new FoodAndBeverage("P1003", "Pepsi", "Water", 2.50);

        tickArr1[0] = new Ticket("P1004", "BC One", true);
        tickArr1[1] = new Ticket("P1004", "BC One", true);
        tickArr1[2] = new Ticket("P1004", "BC One", false);

        tickArr2[0] = new Ticket("P1005", "JayC", true);
        tickArr2[1] = new Ticket("P1005", "JayC", true);
        tickArr2[2] = new Ticket("P1005", "JayC", true);

        
        for (int i = 0; i < fnbArr.length; i++) {
            System.out.print(fnbArr[i].toString());
            System.out.print("\n");
        }
        System.out.print("\n");
        System.out.print("\n");
        for (int i = 0; i < tickArr1.length; i++) {
            System.out.print(tickArr1[i].toString());
            System.out.print("\n");
        }
        System.out.print("\n");
        System.out.print("\n");
        for (int i = 0; i < tickArr2.length; i++) {
            System.out.print(tickArr2[i].toString());
            System.out.print("\n");
        }
    }
}
