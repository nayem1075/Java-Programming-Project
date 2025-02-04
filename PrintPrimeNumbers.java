
package com.mycompany.loop;
import java.util.Scanner;

public class PrintPrimeNumbers {
    
    public static void main(String[] args){
        
        Scanner User = new Scanner(System.in);
        
       int number, InitialNumber,FinalNumber,count=0;
       
       System.out.print("Enter Initial Number : ");
       InitialNumber = User.nextInt();
       System.out.print("Enter Final Number : ");
       FinalNumber = User.nextInt(); 
       
       for(number=InitialNumber; number<=FinalNumber; number++){
           count=0;
           
           if(number<=1){
               continue;
           }
           for(int i=2; i<=(int)Math.sqrt(number); i++){
               if(number%i==0){
                   count++;
                   break;
               }
           }
           if(count==0){
               System.out.println(number);
           }
       }
    }
    
}
