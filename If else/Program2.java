
package com.mycompany.ifelse;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args){
        
        Scanner User = new Scanner(System.in);
        
        int number;
        
        System.out.print("Enter any number : ");
        number = User.nextInt();
        
        if(number>0){
            System.out.println("The number is positive");
        }
        else{
        System.out.println("The number is Negative or Zero");
        }
        
    }
    
}
