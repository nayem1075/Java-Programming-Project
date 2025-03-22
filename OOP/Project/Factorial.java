
package com.mycompany.oop;
import java.util.Scanner;
public class Factorial {
    
    int factorial(int n){
        
        if(n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    
    public static void main(String [] args){
        
        Scanner user = new Scanner(System.in);
        
        System.out.print("Enter number for find factorial : ");
        int n = user.nextInt();
        
        Factorial ob = new Factorial();
        System.out.println("Factorial of "+n+" = "+ob.factorial(n));
        
    }
    
}
