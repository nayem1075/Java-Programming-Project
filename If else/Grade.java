
package com.mycompany.ifelse;
import java.util.Scanner;


public class Grade {
    
    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);
        
        int marks;
         System.out.print("Enter marks : ");
         marks = Input.nextInt();
         
         if(marks>=80 && marks<=100){
             System.out.println("Grade : A+");
         }
       else if(marks>=70 && marks<=79){
             System.out.println("Grade : A");
         }
                else if(marks>=60 && marks<=69){
             System.out.println("Grade : A-");
         }
                else if(marks>=50 && marks<=59){
             System.out.println("Grade : B");
         }
                else if(marks>=40 && marks<=49){
             System.out.println("Grade : C");
         }
                else if(marks>=33 && marks<=39){
             System.out.println("Grade : D");
         }
                else if(marks>=0 && marks<=32){
             System.out.println("Grade : F");
         }
                else{
         System.out.println("Please enter a valid marks between (0-100)");
                }
    }
    
}
