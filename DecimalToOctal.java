
package com.mycompany.numbersystemconversation;
import java.util.Scanner;

public class DecimalToOctal {
    
    public static void main(String[] args){
        
        Scanner user = new Scanner(System.in);
        
        System.out.print("Enter any decimal number : ");
        int decimal = user.nextInt();
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal = "+octal);
        
        
    }
    
}
