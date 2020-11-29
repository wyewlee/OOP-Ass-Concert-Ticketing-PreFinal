
import java.util.Scanner;

public class CustomerMenu {

    static Scanner scan = new Scanner(System.in);
    static int ticketCount = 100;

    static String packageA = "French Fries + Coca-Cola";
    static String packageB = "Donuts + 100 plus";
    static String packageC = "Tuna Sandwhich + Sprite";
    static String packageD = "Popcorn + Mineral Water";

    static double priceA = 7.00;
    static double priceB = 5.00;
    static double priceC = 10.00;
    static double priceD = 6.00;

    static String childrenTicket = "Children Tickets (below 12 years old)";
    static String adultTicket = "Adult Tickets";

    public static void menu() {

        System.out.print("=============================\n");
        System.out.println("\tCustomer Menu");
        System.out.println("=============================");
        System.out.println("1. Purchasing Tickets");
        System.out.println("2. Food & Beverages");
        System.out.println("3. Exit");
        System.out.print("Enter Selection (1-3) : ");
    }

    public static void ticketPrice() {
        System.out.println("============================================");
        System.out.println("\t\tTicket Counter");
        System.out.println("============================================");
        System.out.println("1. " + childrenTicket + " - RM  7.00");
        System.out.println("2. " + adultTicket + "                         - RM 15.00");
        System.out.print("Enter Selection (1-2): ");
    }

    public static void foodBeverageMenu(String packageA, String packageB, String packageC, String packageD) {

        System.out.println("====================================");
        System.out.println("\tFood & Beverage Menu");
        System.out.println("====================================");
        System.out.println("1. " + packageA + " - RM  7.00");
        System.out.println("2. " + packageB + "        - RM  5.00");
        System.out.println("3. " + packageC + "  - RM 10.00");
        System.out.println("4. " + packageD + "  - RM  6.00");
        System.out.println("5. Exit \n");

    }

    public static void receiptA() {
        System.out.println("\t==============================================");
        System.out.println("\t\t\tF&B Receipt");
        System.out.println("\t==============================================");
        System.out.println("\tChoice of F&B : " + packageA);
        System.out.println("\tTotal Amount : RM " + priceA);

    }

    public static void receiptB() {
        System.out.println("\t==============================================");
        System.out.println("\t\t\tF&B Receipt");
        System.out.println("\t==============================================");
        System.out.println("\tChoice of F&B : " + packageB);
        System.out.println("\tTotal Amount : RM " + priceB);

    }

    public static void receiptC() {
        System.out.println("\t==============================================");
        System.out.println("\t\t\tF&B Receipt");
        System.out.println("\t==============================================");
        System.out.println("\tChoice of F&B : " + packageC);
        System.out.println("\tTotal Amount : RM " + priceC);

    }

    public static void receiptD() {
        System.out.println("\t==============================================");
        System.out.println("\t\t\tF&B Receipt");
        System.out.println("\t==============================================");
        System.out.println("\tChoice of F&B : " + packageD);
        System.out.println("\tTotal Amount : RM " + priceD);

    }

    public static void mainMenu() {

        Concert c = new Concert();
        Scanner input = new Scanner(System.in);

        int select;
        int s;
        String exitOrNot;
        String conTinue;
        int count = 0;
        int seat = 0;

        do {
            menu();
            select = scan.nextInt();
            System.out.println();

            if (select < 3) {
                switch (select) {
                    case 1:
                        do {
                            ticketPrice();
                            System.out.print("Enter Selection (1-2): ");
                            s = scan.nextInt();

                            if (s == 1) {
                                ticketCount++;
                                seat++;
                                System.out.println();
                                System.out.print("You have purchased a [ " + childrenTicket + " ]\n");

                            } else if (s == 2) {
                                ticketCount++;
                                seat++;
                                System.out.println();
                                System.out.print("You have purchased a [ " + adultTicket + " ]\n");

                            } else if (s == 0) {
                                System.out.println();
                                System.out.println("Invalid Selection!");
                                System.out.println();
                                count--;
                                seat--;
                                select = 5;

                            } else if (s > 2) {
                                System.out.println();
                                System.out.println("Invalid Selection!");
                                System.out.println();
                                count--;
                                seat--;
                            }

                            if (ticketCount > 0) {
                                count++;
                            }

                        } while (s > 2);

                        if (s > 0 || s < 3) {

                            if (s == 1 || s == 2) {
                                System.out.println();

                                System.out.println("\t==============================================");
                                System.out.println("\t\t\tPurchased Ticket");
                                System.out.println("\t==============================================");
                                System.out.println("\tTicket No : [ " + ticketCount + " ]" + "\t\tSeat No: [ " + seat + " ]");
                                System.out.println("\tTotal tickets : " + count);
                                System.out.println(c.toString());

                                System.out.println();
                                System.out.print("Do you want to continue? (yes/no) : ");
                                conTinue = input.nextLine();

                                if (conTinue.equals("yes")) {
                                    select = 5;
                                    System.out.println();
                                }
                            }
                            System.out.println();
                        }
                        break;

                    case 2:
                        do {
                            foodBeverageMenu(packageA, packageB, packageC, packageD);
                            System.out.print("Enter choice (1-5) : ");
                            s = scan.nextInt();

                            if (s == 1) {
                                System.out.println();
                                System.out.println("\tYour choice of F&B are Package A.");
                                System.out.println();
                                receiptA();
                                System.out.println();

                            } else if (s == 2) {
                                System.out.println();
                                System.out.println("\tYour choice of F&B are Package B.");
                                System.out.println();
                                receiptB();
                                System.out.println();

                            } else if (s == 3) {
                                System.out.println();
                                System.out.println("\tYour choice of F&B are Package C");
                                System.out.println();
                                receiptC();
                                System.out.println();

                            } else if (s == 4) {
                                System.out.println();
                                System.out.println("\tYour choice of F&B are Package D");
                                System.out.println();
                                receiptD();
                                System.out.println();
                            } else if (s == 5) {
                                System.out.print("Are you sure (yes/no) : ");
                                conTinue = input.nextLine();
                                System.out.println();
                                if (conTinue.equals("no")) {
                                    select = 5;
                                    System.out.println();
                                }
                            } else {
                                System.out.println("Invalid Choice!");
                                System.out.println();
                            }

                            if (s > 0 && s < 5) {
                                System.out.print("Do you still wish to continue (yes/no) : ");
                                conTinue = input.nextLine();
                                System.out.println();

                                if (conTinue.equals("yes")) {
                                    select = 5;
                                    System.out.println();
                                }
                            }
                        } while (s > 5);
                        break;
                    case 3:
                        break;
                }
            }
        } while (select > 3);
    }

    public static void main(String args[]) {  //dont do main method under same class
        mainMenu();
    }
}
