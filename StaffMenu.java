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
    
     
    public static void Menu(){
        
        System.out.println("1.Add concert");
        System.out.println("2.Add performer details");
        System.out.println("3.Change staff details");
        System.out.println("4.Change performer details");
        System.out.println("5.Change concert details");
        System.out.println("6.Change food and beverage details");
        System.out.println("7.List all concert details");
        System.out.println("8.List ticket sales details\n\n");
        
}
    
    public static void Menu1(){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Press 1 to continue, 2 to exit");
        
        
    }
    
    public static void Addconcert(){
    
        Scanner scan = new Scanner(System.in);
        ArrayList<String> concertlist = new ArrayList<String>();
        
        
        Menu1();
        int selection = scan.nextInt();
        if (selection == 1){
        System.out.print("Concert name: ");
        String Concert = scan.next();
        concertlist.add(Concert);
        }else if (selection == 2){
        System.out.println("Goodbye");
        }else if (selection > 2){
        System.out.println("Error input");
        }
      
        System.out.println("========================================================");
        for (String i : concertlist){
            System.out.println("Concert name: " + concertlist);
        }
        
        
}
    
    public static void Addperformer(){
        
        Scanner scan = new Scanner(System.in);    
        int selection;
        ArrayList<String> performerlist = new ArrayList<String>();
        ArrayList<String> performercompany = new ArrayList<String>();
        
        
        do{
        Menu1();
        selection = scan.nextInt();
        if (selection == 1){
        System.out.print("name: ");
        String pname = scan.next();
        System.out.print("Company: ");
        String pcompany = scan.next();
        performerlist.add(pname);
        performercompany.add(pcompany);
        
        
        }
        }while( selection != 2);
        
        System.out.println("=========================Performer Details================================");
     
        System.out.println("Performer name: \n" + performerlist + "\nPerformer company: \n" + performercompany);
        
    
        }
    
    public static void Changestaffdetails(){
        
    }
    
    public static void Changeperformerdetails(){
        
    }
    
    public static void Changeconcertdetails(){
        
    }
      
    public static void ChangeFANDBdetails(){
        
    }
    
    public static void concertDetails(){
        
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
            System.out.print("Please enter your selection according to the menu number: ");
            selection = scan.nextInt();
            
            if (selection == 1){
                Addconcert();
            }else if (selection == 2){
                Addperformer();
            }else if (selection == 3){
                Changestaffdetails();
            }else if (selection == 4){
                Changeperformerdetails();
            }else if (selection == 5){
                Changeconcertdetails();
            }else if (selection == 6){
                ChangeFANDBdetails();
            }else if (selection == 7){
                concertDetails();
            }else if (selection == 8){
                ticketSales();
            }
        
         }while (selection > 9);
}
}

