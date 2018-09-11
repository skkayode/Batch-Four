/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age;
import java.util.Scanner;
/**
 *
 * @author iibrahimbuba
 */
public class Age {
    
    public static void main(String[] args) {
    Scanner keyboard = new Scanner (System.in);
    int MyAge;
    int CurrentYear;
    int inHundredyears = 100;
    String YourName;
    System.out.print("This program was written to get your year of birth "
            + "and the year in which you become 100 years old.\n");
    
    System.out.println("How old are you currently?");
    MyAge = keyboard.nextInt();
    
    System.out.println("What year is this?");
    CurrentYear = keyboard.nextInt();
    
    
    System.out.println("Your year of birth was " + (CurrentYear - MyAge ));
    
    System.out.println("You will become 100 years old in the year " + (CurrentYear + inHundredyears));
    
    //this is to tell you your nme and howlong your name is
    
    System.out.println("Whats your name?");
    YourName = keyboard.next();
    
    //Letter to the filler
    
   System.out.println("Hello " + YourName + ".\n" + " We now know that you are " + MyAge + " Years old, and that you were born "
                        + (CurrentYear - MyAge) + " and we hope to see you by " + (CurrentYear + inHundredyears)+
                            " when you will be celebrating 100 years old\n" + "Cheers!");
    /*if ( YourName.Lenght == 10){
        System.out.print("Your name is long");
    }*/
    };
}
