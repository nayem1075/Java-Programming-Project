
package com.mycompany.numbersystemconversation;
import java.util.Scanner;

public class DecimalToBinary {
    
    public static void main(String[] args){
        
     Scanner input = new Scanner(System.in);
     
        System.out.print("Enter any decimal number : ");
        int decimal = input.nextInt();
        String binary = Integer.toBinaryString(decimal);
        
        System.out.println("Binary = "+binary);
        
    }
}
