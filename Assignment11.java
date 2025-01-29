
package com.mycompany.loop;
import java.util.Scanner;


public class Assignment11 {
    
    public static void main(String[] args){
        
        Scanner Input = new Scanner(System.in);
        
        int factorial=1,number;
        
        System.out.print("Enter number to check factorial : ");
        number = Input.nextInt();
        
        for(int i=1; i<=number; i++){
            
            factorial = factorial*i;
            
        }
        
        System.out.println("Factorial = "+factorial);
        
    }
    
}
