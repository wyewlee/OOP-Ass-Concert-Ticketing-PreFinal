
import java.util.Scanner;

public class CustomerMenu {

    static Scanner scan = new Scanner(System.in);
    static Scanner sc = new Scanner(System.in);
    static int ticketCount = 100;
    static Object boughtList[] = new Object[99];

    public static void menu() {
        System.out.print("=============================\n");
        System.out.println("\tCustomer Menu");
        System.out.println("=============================");
        System.out.println("1. Purchasing Tickets");
        System.out.println("2. Food & Beverages");
        // what have bought
        System.out.println("3. Exit");
    }

    public static void foodBeverageMenu(FoodAndBeverage[] fnbArr) {
        System.out.println("====================================");
        System.out.println("\tFood & Beverage Menu");
        System.out.println("====================================");
        System.out.println("1. " + fnbArr[0].getProdName() + "RM " + fnbArr[0].getUnitPrice() + "0");
        System.out.println("2. " + fnbArr[1].getProdName() + "RM " + fnbArr[1].getUnitPrice() + "0");
        System.out.println("3. " + fnbArr[2].getProdName() + "RM " + fnbArr[2].getUnitPrice() + "0");
        System.out.println("4. " + fnbArr[3].getProdName() + "RM " + fnbArr[3].getUnitPrice() + "0");
        System.out.println("5. Exit \n");
    }

    public static void fnbShowReceipt(FoodAndBeverage[] fnbArr, int fnbNum) {
        System.out.println("\t==============================================");
        System.out.println("\t\t\tF&B Receipt");
        System.out.println("\t==============================================");
        System.out.println("\tChoice of F&B : " + fnbArr[fnbNum].getProdName());
        System.out.println("\tTotal Amount : RM " + fnbArr[fnbNum].getUnitPrice());
    }

    public static void listConcert(Concert conArr[]) {
        System.out.println("\t============================================");
        System.out.println("\t\t\tConcerts Listing");
        System.out.println("\t============================================");
        System.out.println("\tConcertName\tVenue\tDate\tTime");

        int emptyN = ArrCheck.checkArrayNEmpty(conArr);
        for (int i = 0; i < emptyN; i++) {
            System.out.print((i + 1) + " . " + "\t" + conArr[i].getConcertName());
            System.out.print("\t" + conArr[i].getVenue());
            System.out.print("\t" + conArr[i].getConcertDate());
            System.out.print("\t" + conArr[i].getConcertTime() + "\n");
        }
    }

    public static void ticketShowReceipt(Concert conArr[], Ticket tickArr[],
            int conNum, int tickNum) {
        System.out.println("\t==============================================");
        System.out.println("\t\t\tTicket Receipt");
        System.out.println("\t==============================================");
        System.out.println("\tConcert Name : " + conArr[conNum].getConcertName());
        System.out.println("\tVenue : " + conArr[conNum].getVenue());
        System.out.println("\tConcert Date : " + conArr[conNum].getConcertDate());
        System.out.println("\tConcert Time : " + conArr[conNum].getConcertTime());
        System.out.print("\tAdult : ");
        System.out.println((tickArr[tickNum].isAdultTicket() ? "YES" : "NO"));
        System.out.println("\tTicket Price : RM" + tickArr[tickNum].getTICKETPRICE());
        System.out.println("\tDiscount : RM" + (tickArr[tickNum].getFinalPrice() - tickArr[tickNum].getTICKETPRICE()));
        System.out.println("\tTotal Paid : RM " + tickArr[tickNum].getFinalPrice());
    }

    //buyTicket
    public static void buyTicket(Concert conArr[], Ticket tickArr[]) {
        Scanner sc = new Scanner(System.in);
        listConcert(conArr);
        boolean exit = false;

        System.out.println("Please select which concert to buy: ");
        int choice = scan.nextInt();

        ticketPrice();
        System.out.println("Are you an adult? (Y/N)");
        String inAdult = sc.nextLine();
//        char isadult = inAdult.charAt(0);
//        boolean isAdult;
//
//        if (Character.toUpperCase(isadult) == 'Y') {
//            isAdult = true;
//        } else {
//            isAdult = false;
//        }

        for (int i = choice - 1; i < choice; i++) {
            int nList = ArrCheck.checkArrayNEmpty(boughtList);
            for (int j = nList; j < (nList + 1); j++) {
                boughtList[j] = conArr[i];
                ticketShowReceipt(conArr, tickArr, i, i);
                System.out.println("Thank you for buying the ticket...");
                System.out.println("Press ENTER to continue to print the ticket.");
                String abc = sc.nextLine();
                ticketPrint(conArr, tickArr, i, i);
            }
        }

    }

    public static void ticketPrint(Concert conArr[], Ticket tickArr[],
            int conNum, int tickNum) {
        System.out.println("\t==============================================");
        System.out.println("\t\t\tTicket");
        System.out.println("\t==============================================");
        System.out.println("\tTicket ID: " + tickArr[tickNum].getTicketID());
        System.out.println("\tSeat NO: " + tickArr[tickNum].getSeatNo());
        System.out.println("\tConcert Name : " + conArr[conNum].getConcertName());
        System.out.println("\tVenue : " + conArr[conNum].getVenue());
        System.out.println("\tConcert Date : " + conArr[conNum].getConcertDate());
        System.out.println("\tConcert Time : " + conArr[conNum].getConcertTime());
        System.out.print("\tAdult : ");
        System.out.println((tickArr[tickNum].isAdultTicket() ? "YES" : "NO"));

        System.out.println("Press ENTER to continue to go back to Main Menu");
        String abc = sc.nextLine();

    }

    public static void ticketPrice() {
        System.out.println("============================================");
        System.out.println("\t\tTicket Counter");
        System.out.println("============================================");
        System.out.println("1. " + "Children Tickets (below 12 years old) - RM  7.00");
        System.out.println("2. " + "Adult Tickets                         - RM 15.00");
    }

    public static void menuMain(FoodAndBeverage[] fnbArr, Concert[] conArr, Ticket[] tickArr) {

        Scanner input = new Scanner(System.in);
        int select;
        int s;
        String conTinue;

        do {
            menu();
            System.out.print("Enter Selection (1-3) : ");
            select = scan.nextInt();
            System.out.println();

            if (select < 4) {
                switch (select) {
                    case 1:
                        buyTicket(conArr, tickArr);
                        menuMain(fnbArr, conArr, tickArr);
                        break;
                    case 2:
                        int s1 = 0;
                        do {
                            foodBeverageMenu(fnbArr);
                            System.out.print("Enter choice (1-5) : ");
                            s1 = scan.nextInt();

                            switch (s1) {
                                case 1:
                                    System.out.println("\n\tYour choice of F&B are Package A.\n");
                                    fnbShowReceipt(fnbArr, 0);
                                    break;
                                case 2:
                                    System.out.println("\n\tYour choice of F&B are Package B.\n");
                                    fnbShowReceipt(fnbArr, 1);
                                    break;
                                case 3:
                                    System.out.println("\n\tYour choice of F&B are Package C\n");
                                    fnbShowReceipt(fnbArr, 2);
                                    break;
                                case 4:
                                    System.out.println("\n\tYour choice of F&B are Package D\n");
                                    fnbShowReceipt(fnbArr, 3);
                                    break;
                                case 5:
                                    System.out.print("Are you sure you want to exit? (yes/no): ");
                                    conTinue = input.nextLine();
                                    conTinue = conTinue.toUpperCase();
                                    System.out.println();
                                    if (conTinue.equals("NO")) {
                                        select = 5;
                                    }
                                    break;
                                default:
                                    System.out.println("Invalid Choice!\n");
                                    break;
                            }

                            if (s1 > 0 && s1 < 5) {
                                System.out.print("Do you still wish to continue (yes/no) : ");
                                conTinue = input.nextLine();
                                conTinue = conTinue.toUpperCase();
                                if (conTinue.equals("YES")) {
                                    select = 5;
                                }
                            }
                        } while (s1 > 5);
                        break;
                    case 3:
                        System.out.println("You are exiting...");
                        break;
                }
            } else {
                System.out.println("Exiting...Thank you!");
            }
        } while (select > 3);
    }
}
