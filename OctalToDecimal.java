
package com.mycompany.numbersystemconversation;

import java.util.Scanner;


public class OctalToDecimal {
    
        public static void main(String[] args){
        Scanner User = new Scanner(System.in);
        
        System.out.print("Enter any Octal Number : ");
        String octal = User.nextLine();
        
        Integer decimal = Integer.parseInt(octal, 8);
        System.out.println("Decimal = "+decimal);
        
        
    }
}
