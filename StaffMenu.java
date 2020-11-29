
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.Scanner;

public class StaffMenu {

    static Scanner scan = new Scanner(System.in);
    static Scanner sc = new Scanner(System.in);
    static Performer performerArr[] = new Performer[99];
    static Concert concertArr[] = new Concert[10];
    static Staff staffArr[] = new Staff[99];
    static int choice = 0;

    public static void menu() {
        System.out.println("1.Add concert ");
        System.out.println("2.Add performer ");
        System.out.println("3.Add staff ");
        System.out.println("4.List ticket sales details ");
        System.out.println("5.Exit\n");
    }

    public static void choice() {
        System.out.print("Do you wish to continue?  1-Yes  2-No  : ");
    }

    public static void addConcert() {

        int empty = ArrCheck.checkArrayNEmpty(concertArr);
        int endnum = empty + 1;
        //check which N in array is empty

        for (int i = empty; i < endnum; i++) {

            System.out.println("Welcome to the addConcert Menu\n");
            System.out.print("Concert Name : ");
            String n = sc.nextLine();//let user input name

            System.out.print("Concert Venue : ");
            String v = sc.nextLine();//let user input venue

            System.out.print("Concert Date(DD-MON-YYYY) : ");
            String d = sc.nextLine();//let user input venue

            System.out.print("Concert Time (HH:MM PM/AM): ");
            String t = sc.nextLine();//let user input venue

            concertArr[i] = new Concert(n, v, d, t);
        }

        System.out.println("========================Concert Details=========================");
        for (int i = 0; i < endnum; i++) {
            System.out.println(concertArr[i].toString());
        }
    }

    public static void addPerformer() {
        int empty = ArrCheck.checkArrayNEmpty(performerArr);
        int endnum = empty + 1;
        //check which N in array is empty

        for (int i = empty; i < endnum; i++) {
            System.out.print("\nName : ");
            String name = scan.nextLine();//let user input name

            System.out.print("IC No : ");
            String ic = scan.nextLine();//let user input ic no

            System.out.print("Gender : ");
            String gender = scan.nextLine();//let user input gender

            System.out.print("Contact No : ");
            String contact = scan.nextLine();//let user input contact number

            System.out.print("Performer ID : ");
            String id = scan.nextLine();//let user input contact number

            System.out.print("Managing Company: ");
            String managingCompany = scan.nextLine();//let user input company

            performerArr[i] = new Performer(id, managingCompany,
                    name, ic, gender, contact);
        }

        System.out.println("========================Performer Details=========================");
        for (int i = 0; i < endnum; i++) {
            System.out.println(performerArr[i].toString());
        }
    }

    public static void addStaff() {

        int empty = ArrCheck.checkArrayNEmpty(staffArr);
        int endnum = empty + 1;
        //check which N in array is empty

        for (int i = empty; i < endnum; i++) {
            System.out.print("\nStaff ID : ");
            String id = scan.nextLine();//let user input name

            System.out.print("Staff Position ： ");
            String position = scan.nextLine();

            System.out.print("\nName : ");
            String name = scan.nextLine();//let user input name

            System.out.print("IC No : ");
            String ic = scan.nextLine();//let user input ic no

            System.out.print("Gender : ");
            String gender = scan.nextLine();

            System.out.print("Contact No : ");
            String contact = scan.nextLine();

            staffArr[i] = new Staff(id, position, name, ic, gender, contact);
        }
        System.out.println("========================Staff Details=========================");
        for (int i = 0; i < endnum; i++) {
            System.out.println(staffArr[i].toString());
        }
    }

    public static void ticketSales() {

    }

    public static void localDt() { //print time and date
        LocalDate mydate = LocalDate.now();
        LocalTime mytime = LocalTime.now();
        System.out.println("Welcome User, the date for today is " + mydate + " and the time now is " + mytime);
    }

    public static void staffMainMenu() {
        int selection = 0;
        int choice = 0;
        while (selection != 5) {
            localDt(); //printLocalTime
            menu(); //print menu
            System.out.print("Please enter your selection according to the menu number (1 - 5):  ");
            try {

                selection = scan.nextInt();

                switch (selection) {
                    case 1:
                        while (choice != 2) {
                            addConcert();
                            choice();
                            choice = scan.nextInt();
                        }
                        break;
                    case 2:
                        while (choice != 2) {
                            addPerformer();
                            choice();
                            choice = scan.nextInt();
                        }
                        break;
                    case 3:
                        while (choice != 2) {
                            addStaff();
                            choice();
                            choice = scan.nextInt();
                        }
                        break;
                    case 4:
                        ticketSales();
                        break;
                    case 5:
                        System.out.println("Goodbye");
                        break;
                    default:
                        System.out.println("Invalid selection");
                        break;
                }
            } catch (Exception e) { //handle exception
                System.out.println("Invalid selection");
                staffMainMenu();
                throw e;
            }
        }
    }
}
