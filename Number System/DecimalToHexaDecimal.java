
package com.mycompany.numbersystemconversation;
import java.util.Scanner;

public class DecimalToHexaDecimal {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any decimal number : ");
        int decimal = input.nextInt();
        String hexa = Integer.toHexString(decimal);
        
        System.out.println("HexaDecimal : "+hexa);
        
    }
    
}
