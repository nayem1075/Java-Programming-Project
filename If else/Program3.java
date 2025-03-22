
package com.mycompany.ifelse;
import java.util.Scanner;


public class Program3 {
    
    public static void main(String[] args){
        
        Scanner Input = new Scanner(System.in);
        
        int number;
        
        System.out.print("Enter any number : ");
        number = Input.nextInt();
        
        if (number>0){
            System.out.println("The number is Positive");
        }
        else if(number<0){
            System.out.println("The number is Negative");
        }
        else{
            System.out.println("The number is Zero");
        }
    }
    
}
