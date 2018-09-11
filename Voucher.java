/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Voucher;
import java.util.Random;
/**
 *
 * @author iibrahimbuba
 */
public class Voucher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random card = new Random();
        int voucher;
        int voucher2;
        int voucher3;        
        int voucher4;
        
        System.out.println("Your voucher number is ");
        
         voucher = card.nextInt(9999) + 1000;
            System.out.print(voucher + " ");
         voucher2 = card.nextInt(9999) + 1000;
            System.out.print(voucher2 + " ");
         voucher3 = card.nextInt(9999) + 1000;
            System.out.print(voucher3 + " ");
         voucher4 = card.nextInt(9999) + 1000;
            System.out.print(voucher4 + " ");
        
    }
    
}
