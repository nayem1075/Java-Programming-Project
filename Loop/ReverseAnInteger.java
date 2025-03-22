
package com.mycompany.loop;
import java.util.Scanner;

public class ReverseAnInteger {
    
    public static void main(String[] args){
        
        Scanner User = new Scanner(System.in);
        
        int number, temp, reminder, sum=0;
        
        System.out.print("Enter any number : ");
        number = User.nextInt();
        
        temp = number;
        
        while(temp!=0){
            
            reminder = temp%10;
            
            sum = sum*10 + reminder;
            temp = temp/10;
            
        }
        System.out.println(number+ " Reverse number is "+sum);
    }
    
}
