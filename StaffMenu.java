/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.Scanner;


public class StaffMenu {

    static Performer performerArr[] = new Performer[99];


    public static void Menu(){

        System.out.println("1.Add concert ");
        System.out.println("2.Add performer ");
        System.out.println("3.Add staff ");
        System.out.println("4.List ticket sales details ");
        System.out.println("5.Exit\n");

}

    public static void Choice(){

        System.out.print("Do you wish to continue?  1-Yes  2-No  : ");

    }



    public static void Addconcert(){

        Scanner scan = new Scanner(System.in);
        Concert concertArr[] = new Concert[10];
        

        for (int i = 0; i < concertArr.length; i++){

        System.out.print("\nName : ");
        String name = scan.nextLine();//let user input name

        System.out.print("Venue : ");
        String venue = scan.nextLine();//let user input venue

        Concert concert = new Concert(name, venue);
        

        System.out.println("========================Concert Details=========================");
        System.out.println(concert);
 

        }

}

    public static void Addperformer(){

        Scanner scan = new Scanner(System.in);
     
        Performer performerArr[] = new Performer[99];

 
        for (int i = 0; i < performerArr.length; i++){

        System.out.print("\nName : ");
        String name = scan.nextLine();//let user input name

        System.out.print("IC No : ");
        String ic = scan.nextLine();//let user input ic no

        System.out.print("Gender : ");
        String gender = scan.nextLine();//let user input gender

        System.out.print("Contact No : ");
        String contact = scan.nextLine();//let user input contact number

        Person person = new Person(name, ic, gender, contact);

        System.out.print("Managing Company: ");
        String managingCompany = scan.nextLine();//let user input company

        Performer performer = new Performer(name, ic, gender, contact, managingCompany);
        
        System.out.println("");
        System.out.println("========================Performer Details=========================");
        System.out.println(person +""+ performer);
 

        }




        }


    public static void addStaff(){

        Scanner scan = new Scanner(System.in);
        Staff []staffArr = new Staff[99];
        int choice;


        for (int i = 0; i < staffArr.length; i++){

        System.out.print("\nName : ");
        String name = scan.nextLine();//let user input name

        System.out.print("IC No : ");
        String ic = scan.nextLine();//let user input ic no

        System.out.print("Gender : ");
        String gender = scan.nextLine();

        System.out.print("Contact No : ");
        String contact = scan.nextLine();

        Person person = new Person(name, ic, gender, contact);
        

        System.out.print("Staff Position ： ");
        String position = scan.nextLine();
        
        Staff staff = new Staff(name, ic, gender, contact, position );

        System.out.println("");
        System.out.println("========================Staff Details=========================");
        System.out.println(person +" "+ staff);

        }




        }






    public static void ticketSales(){

    }

    public static void Localdt(){

        LocalDate mydate = LocalDate.now();
        LocalTime mytime = LocalTime.now();
        System.out.println("Welcome User, the date for today is " + mydate + " and the time now is " + mytime);

    }



    public static void Staffmenumain(){

        Scanner scan = new Scanner(System.in);

        int selection;
        int choice;
        
        Localdt();

        Menu();

        do{
            System.out.print("Please enter your selection according to the menu number (1 - 5):  ");
            selection = scan.nextInt();
            System.out.println();

            if (selection == 1){
                do{
                Addconcert();
                Choice();
                choice = scan.nextInt();
                }while (choice != 2);
            }else if (selection == 2){
                do{
                Addperformer();
                choice = scan.nextInt();
                }while (choice != 2);
            }else if (selection == 3){
                do{
                addStaff();
                choice = scan.nextInt();
                }while (choice != 2);
            }else if (selection == 4){
                ticketSales();
            }else if (selection == 5){
                System.out.println("Goodbye");
            }else if (selection > 5){
                System.out.println("Invalid selection");
            }

         }while (selection > 5);
}
}

