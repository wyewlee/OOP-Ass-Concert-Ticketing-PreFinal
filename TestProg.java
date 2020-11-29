
public class TestProg {

    public static void main(String args[]) {
        Ticket tickArr1[] = new Ticket[3];
        Ticket tickArr2[] = new Ticket[3];
        FoodAndBeverage fnbArr[] = new FoodAndBeverage[4];
        Concert conArr[] = new Concert[2];
        Staff staffArr[] = new Staff[2];
        Performer perfoArr[] = new Performer[2];
        Customer custoArr[] = new Customer[2];

        conArr[0] = new Concert("Axiata Arena Bukit Jalil", "02-JAN-2020", "08:00PM");
        conArr[1] = new Concert("Axiata Arena Bukit Jalil", "22-AUG-2020", "05:00PM");

        staffArr[0] = new Staff("S1001", "Manager", "John", "000000-12-0000", "M", "012-3456789");
        staffArr[1] = new Staff("S1002", "Supervisor", "Lewis", "123456-12-0000", "M", "012-3456789");
        staffArr[2] = new Staff("S1003", "Cashier", "Stuart", "000000-12-1234", "F", "012-3456789");

        perfoArr[0] = new Performer("Pe1001", "Super Sdn. Bhd.", "John Bolton", "123300-01-1234", "M","011-11111111");
        perfoArr[1] = new Performer("Pe1002", "Super Sdn. Bhd.", "Jane Clark", "123300-12-1234", "F","011-11111111");

        custoArr[0] = new Customer("Cu1001", "Lily", "121212-12-1212","F","011-1111");
        custoArr[1] = new Customer("Cu1002", "Peter", "121212-08-1234", "M", "011-1111");

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
