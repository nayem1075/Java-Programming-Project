
package com.mycompany.operator;
import java.util.Scanner;

public class ArithmeticOperator1 {
    
    public static void main(String[] args){
        
        Scanner Input = new Scanner(System.in);
    
        
        int num1, num2, result;
        
        System.out.print("Enter first number : ");
       num1 = Input.nextInt();
       
       System.out.print("Enter second number : ");
       num2 = Input.nextInt();
       
       result = num1 + num2;
       System.out.println("Sum = "+result);
       
       result = num1 - num2;
       System.out.println("Sub = "+result);
       
       result = num1 * num2;
       System.out.println("Multiplication : "+result);
       
       double  result1 = (double) num1 / num2;//Type casting
       System.out.println("Div = "+result1);
       
       result = num1 % num2;
       System.out.println("Reminder = "+result);
       
    }
    
}
