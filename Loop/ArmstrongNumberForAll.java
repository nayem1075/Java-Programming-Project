
package com.mycompany.loop;
import java.util.Scanner;

public class ArmstrongNumberForAll {
    
    public static void main(String[] args){
        
       Scanner Input = new Scanner(System.in);
       
       //if digit is 1 then power 1 , digit 2 then power2, digit is 3 then power 3 , digit 4 then power4 
       
       int number, temp, digit=0, reminder, sum=0, logic;
       
       System.out.print("Enter Any number : ");
       number = Input.nextInt();
       
       temp = number;
       while(temp!=0){
           
           temp = temp/10;
           digit++;
       }
       
       temp = number;
       
       while(temp!=0){
           
          reminder = temp%10; //reminder mean vagsesh
          
          logic = (int)Math.pow(reminder,digit);
          sum = sum + logic;
          
          temp = temp/10; 
       }
        if(number==sum){
            
            System.out.println(number+" is an Armstrong number");
        }
        else{
            System.out.println(number+" is not an Armstrong number");
        }
        Input.close();
    }
}
