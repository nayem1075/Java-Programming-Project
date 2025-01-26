
package com.mycompany.assignmentoperator;
import java.util.Scanner;

public class AssignmentOpertor1 {
    
    public static void main(String[] args){
        
        Scanner Input = new Scanner (System.in);
        
        int x, y, sum, sub, multiplication ;
        double div, modulus;
        
        System.out.print("Enter x : ");
        x = Input.nextInt();
        
        System.out.print("Enter y : ");
        y = Input.nextInt();
        
        sum = x+y;
        System.out.println("Sum = "+sum);
        
        sub = x-y;
        System.out.println("Sub = "+sub);
        
        multiplication = x*y;
        System.out.println("Multiplication  = "+multiplication);
        
        div = (double)x/ y;
        System.out.println("Div  = "+div);
    
        
        modulus = (double)x%y;
        System.out.println("x = "+modulus);
        
        
        
        
    }
   
    
}
