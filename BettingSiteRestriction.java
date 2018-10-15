package bettingsiterestriction;
import java.util.*;

public class BettingSiteRestriction {

    
    public static void main(String[] args) {
     Scanner answer = new Scanner(System.in);   
     
     String Username;
     String gender;
     int UserAge;
     char answered;
     //declaring the tools i need  
     
     int score = 0;
     
        //this program is to restricthe gae of users in a betting site to 18
     Scanner input = new Scanner(System.in);  
        
        System.out.println(">-- Registration info --<");
        //user deatials are here such as name and 
        System.out.println("Please enter your name");
        Username = input.next();
        
        System.out.println("whats your Gender");
        gender = input.next();
               
        while(!gender.equals("male") && !gender.equals("female")){
            System.out.println("Invalid gender");
            System.out.println("Please input a proper gender");
            gender = input.next();
        }   
        
              
        System.out.println("Whats your current age");
        UserAge = input.nextInt();
        
            if (UserAge < 0){
                System.out.println("Error, please put in a valid age");
            }else if (UserAge < 18){
                System.out.println("You are not eligible to bet, Thank you for choosing us");
                System.exit(0);
            }else if(UserAge >= 18 && (gender.equals("male"))){
                System.out.println("Welcome " + "Mr " + Username.toUpperCase());
            }else if(UserAge >= 18 && (gender.equals("female"))){
                System.out.println("Welcome " + "Mdm " + Username.toUpperCase());
            }else {
                System.out.println("Welcome");
            }
        
        System.out.println("===================================================");
        System.out.println("In the next few line you are expected to answer the following questions");
        System.out.println("===================================================");
        System.out.println("Please Note: for every question you get you have 10 points\n  at the end of your exam your score would be printed");
        
        //questions       
                
        System.out.println("1. What year di Nigeria gain her independence");
        System.out.println("A: 1915\n B: 1990\n C: 1960\n D: 1963");
        System.out.println("Whats your answer");
        answered = answer.next().charAt(0);
        
        
        if(answered == 'C' || answered == 'c'){
            System.out.println("Correct");
            score+=10;
            System.out.println("Nigeria gained independence in 1960");
        }else{
            System.out.println("Wrong");
            
        }
        
        
        System.out.println("1. What is the  name of Nigerias president");
        System.out.println("A: Bhbari\n B: Buhari\n C: Shagari\n D: Seun");
        System.out.println("Whats your answer");
        answered = answer.next().charAt(0);
        
        
        if(answered == 'B' || answered == 'b'){
            System.out.println("Correct");
            score+=10;
            System.out.println("Nigeria's president is Buhari");
        }else{
            System.out.println("Wrong");
            
        }
               
               
        System.out.println("Your score is " + score + " marks");
        
        
        
       
        
        
        
    }
    
}
