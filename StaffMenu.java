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
import java.util.ArrayList;
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
        
        System.out.println("Do you wish to continue?  1-Yes  2-No");
        
    }
    

    
    public static void Addconcert(){
    
        Scanner scan = new Scanner(System.in);
        ArrayList<String> concertlist = new ArrayList<String>();
        ArrayList<String> venuelist = new ArrayList<String>();
        int choice;
        
        do{
        System.out.println("Press 1 to continue");
        int selection = scan.nextInt();
        if (selection == 1){
        System.out.print("Concert name: ");
        String Concert = scan.next();
        System.out.print("Venue: ");
        String venue = scan.next();
        concertlist.add(Concert);
        venuelist.add(venue);
        }else if (selection == 2){
        System.out.println("Goodbye");
        }else if (selection > 2){
        System.out.println("Error input");
        }
        Choice();
        choice = scan.nextInt();
        }while (choice !=2);
      
        System.out.println("==========================Concert Details==================================");
        for (String i : concertlist){
            System.out.println("Concert name: " + concertlist + "\nVenue: " + venuelist);
        }
        
        
}
    
    public static void Addperformer(){
        
        Scanner scan = new Scanner(System.in);    
        int choice;
        ArrayList<String> performerlist = new ArrayList<String>();
        ArrayList<String> performercompany = new ArrayList<String>();
        
    
        do{
        System.out.println("Press 1 to continue");
        int selection = scan.nextInt();
        if (selection == 1){
        System.out.print("name: ");
        String pname = scan.next();
        System.out.print("Company: ");
        String pcompany = scan.next();
        performerlist.add(pname);
        performercompany.add(pcompany);
        }else if (selection == 2 ){
        System.out.println("Goodbye");
        }else if (selection > 2){
        System.out.println("Error input");
        }
        Choice();
        choice = scan.nextInt();
        }while (choice !=2);
        
        System.out.println();
        System.out.println("=========================Performer Details================================");
     
        System.out.println("Performer name: " + performerlist + "\nPerformer company: " + performercompany);
        
    
        }
    
    
    public static void addStaff(){
        
        Scanner scan = new Scanner(System.in);
        Staff []staffId = new Staff[100];
        int choice;
        
        do{
        for (int i = 0; i < staffId.length; i++){
            
        System.out.print("\nName : ");
        String name = scan.nextLine();//let user input name
        
        System.out.print("IC No : ");
        String ic = scan.nextLine();//let user input ic no
        
        System.out.print("Gender : ");
        String gender = scan.nextLine();
        
        System.out.print("Contact No : ");
        String contact = scan.nextLine();
        
        Person person = new Person(name, ic, gender, contact);
        
        System.out.println("========================Staff Details========================");
        System.out.println(person);
        }     
        Choice();
        choice = scan.nextInt();
        }while (choice !=2);
        }
    

    
    
    public static void ticketSales(){
        
    }
    
    public static void Localdt(){
        
        LocalDate mydate = LocalDate.now();
        LocalTime mytime = LocalTime.now();
        System.out.println("Welcome User, the date for today is " + mydate + " and the time now is " + mytime);

    }
   

    
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        
        int selection;
        
        Localdt();

        Menu();
        
        do{
            System.out.print("Please enter your selection according to the menu number (1 - 5):  ");
            selection = scan.nextInt();
            System.out.println();
            
            if (selection == 1){
                Addconcert();
            }else if (selection == 2){
                Addperformer();
            }else if (selection == 3){
                addStaff();
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

