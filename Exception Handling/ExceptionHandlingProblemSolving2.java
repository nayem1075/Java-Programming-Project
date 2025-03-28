
package com.mycompany.exceptionhandling;

import java.util.Scanner;

public class ExceptionHandlingProblemSolving2 {
    
     public static void main(String[] args) {
         int count = 1;
        do{
         try{
             Scanner input = new Scanner(System.in);
             System.out.print("Please Enter a number : ");
             int num = input.nextInt();
             System.out.println("Square root of "+num+ " is " +Math.sqrt(num));
             count =2;
         }catch (IllegalArgumentException e1){
             System.out.println("Exception : "+e1);
             System.out.println("Cannot calculate square root of a negative number.");
         } catch(Exception e2){
             System.out.println("Exception : "+e2);
             System.out.println("You must enter an integer.Please try again.");
         }
        }while(count==1);
         
    }
    
}
