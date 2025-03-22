
package com.mycompany.ifelse;
import java.util.Scanner;

public class Program1 {
    
    public static void main(String[] args){
        
        Scanner Input = new Scanner(System.in);
        
        int num;
        
        System.out.print("Enter any integer number : ");
        num = Input.nextInt();
        
        if(num>0){
            System.out.println("The number is Positive");
        }
        
    }
    
}
