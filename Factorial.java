
package com.mycompany.loop;
import java.util.Scanner;


public class Factorial {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int num, fact=1;
        
        System.out.print("Enter number for count Factorial : ");
        num = input.nextInt();
        
        for(int i=num; i>=1; i--){
            
            fact = fact*i;
        }
        System.out.println("Factorial of "+num +" = "+fact);
    }
    
}
