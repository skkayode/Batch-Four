/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vowelconsonant;
import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner UserInput = new Scanner (System.in);
       
//declare variables
        String letter;
        String correct = "This is a vowel";
        String wrong = "This is a consonant";
        String error ="Error!!!";
        
//introduce the program        
        
        System.out.println("Hello, i am the vowel teller");
        
//ask for user input        
        System.out.println("Please type in a letter");
        letter = UserInput.next();

//ensure user doesnt input more than one character        
        if (letter.length() >= 1) {
             System.out.println(error);
//ensure the user doesnt input number or special symbol        
        if (letter.compareTo("a") >= 0){
//check if it is a vowel or consonant       
        if ( letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("0") ||letter.equals("u")){
            System.out.println(correct);
        }else{
            System.out.println(wrong);
        }
    }else {
            System.out.println(error);
        }
  }else{
            System.out.println("INVALID");
        }
 }   
}
