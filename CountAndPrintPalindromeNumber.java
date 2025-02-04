
package com.mycompany.loop;
import java.util.Scanner;

public class CountAndPrintPalindromeNumber {
    
    public static void main(String[] args){
        
        Scanner Input =  new Scanner(System.in);
        
        int number, InitialNumber, FinalNumber, temp, reminder, sum, count=0;
        
        System.out.print("Enter Initial Number : ");
        InitialNumber = Input.nextInt();
        
        System.out.print("Enter Final Number : ");
        FinalNumber = Input.nextInt();
        
        for(number = InitialNumber ; number<=FinalNumber; number++){
            
           temp = number;
           sum = 0;
           
           while(temp!=0){
               reminder = temp%10;
               
               sum = sum*10 + reminder;
               temp = temp/10;     
           }
           if(number==sum){
               System.out.println(number);
               count++;
           }
           
        }
        System.out.println("Total Palindrome number = "+count);
        Input.close();
    }
    
}
