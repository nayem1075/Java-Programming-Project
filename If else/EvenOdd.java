
package com.mycompany.ifelse;
import java.util.Scanner;


public class EvenOdd {
 
    public static void main(String[] args){
        
        Scanner Input = new Scanner(System.in);
        
        int num;
        
        System.out.print("Enter any positive number : ");
        num = Input.nextInt();
        
        if(num%2==0){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
    
}
