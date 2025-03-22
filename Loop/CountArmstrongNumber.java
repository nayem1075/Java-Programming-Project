
package com.mycompany.loop;
import java.util.Scanner;

public class CountArmstrongNumber {
    
    public static void main(String[] args){
        
        Scanner User = new Scanner(System.in);
        
        int number, InitialNumber, FinalNumber, temp, reminder, sum, TotalArmstrongNumber=0;
        
        System.out.print("Enter Initial Number : ");
        InitialNumber = User.nextInt();
        
        System.out.print("Enter Final Number : ");
        FinalNumber = User.nextInt();
        
        for(number = InitialNumber; number<=FinalNumber; number++){
            
            temp = number;
            sum = 0;//Before check every new number is 0 
            
            while(temp!=0){
                
                reminder = temp%10;
                
                sum = sum + reminder*reminder*reminder;
                temp = temp/10;
                
            }
            if(number==sum){
                System.out.println(number+" ");
                TotalArmstrongNumber++;
            }
        }
        System.out.println("Total Armstrong Number = "+TotalArmstrongNumber);
        
        User.close();
                
    }
    
}
