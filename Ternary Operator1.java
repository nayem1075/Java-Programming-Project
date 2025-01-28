
package com.mycompany.ternaryoperator;
import java.util.Scanner;


public class Program1 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int x,y,large;
        
        System.out.print("Enter x : ");
        x = input.nextInt();
        
        System.out.print("Enter y : ");
        y = input.nextInt();
        
        large = (x>y)? x:y;
        System.out.println("Large number = "+large);
        
    }
    
}
