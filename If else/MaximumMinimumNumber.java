
package com.mycompany.ifelse;
import java.util.Scanner;


public class MaximumMinimumNumber {
    
 public static void main(String[] args){
     
     Scanner User = new Scanner(System.in);
     
     int num1, num2;
     
     System.out.print("Enter First number : ");
     num1 = User.nextInt();
      System.out.print("Enter Second number : ");
     num2 = User.nextInt();
     
     if(num1>num2){
         System.out.println("Maximum number is "+num1);
     }
     else{
         System.out.println("Maximum number is "+num2);
     }
     
     if(num1<num2){
         System.out.println("Minimum number is "+num1);
     }
     else{
         System.out.println("Minimum number is "+num2);
     }
 }   
    
}
