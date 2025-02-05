
package com.mycompany.loop;
import java.util.Scanner;


public class ArmstrongNumber {
    
    public static void main(String[] args){
        
        Scanner User = new Scanner(System.in);
        
        int number, temp, reminder, sum=0;
        
        System.out.print("Enter any number : ");
        number = User.nextInt();
         
        temp = number;
        
        while(temp!=0){
            
            reminder = temp%10;
            
            sum = sum + reminder*reminder*reminder;
            temp = temp/10;
        }
        if (number == sum){
            
            System.out.println(number+" is an Armstrong number");
        }
        else{
            System.out.println(number+" is not an Armstrong number");
        }
        User.close();
        
    }
    
}
