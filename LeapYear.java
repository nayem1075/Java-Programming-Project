
package com.mycompany.ifelse;
import java.util.Scanner;


public class LeapYear {
    
    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);
        
        int year;
        System.out.print("Enter any year : ");
        year = Input.nextInt();
        
        if(year%400==0){
            System.out.println("Leap Year");
        }
        else if(year%4==0 && year%100!=0){
             System.out.println("Leap Year");
        }
        else{
             System.out.println("Not Leap Year");
        }
    }
    
}
