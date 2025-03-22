
package com.mycompany.ifelse;
import java.util.Scanner;


public class Assignment5 {
    
    public static void main(String[] args){
        
        Scanner Input = new Scanner(System.in);
        
        int age;
        
        System.out.print("Enter an age : ");
        age = Input.nextInt();
        
        if(age>=18){
            System.out.println("Valid Voter");
        }
        
        else{
            System.out.println("Invalid voter");
        }
        
    }
    
}
