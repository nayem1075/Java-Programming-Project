
package com.mycompany.numbersystemconversation;

import java.util.Scanner;

public class HexadecimalToDecimal {
        public static void main(String[] args){
        Scanner User = new Scanner(System.in);
        
        System.out.print("Enter any Hexadecimal Number : ");
        String hexadecimal = User.nextLine();
        
        Integer decimal = Integer.parseInt(hexadecimal, 16);
        System.out.println("Decimal = "+decimal);
        
        
    }
}
