
package com.mycompany.array;
import java.util.Scanner;

public class Assignment18 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String [] weekdays = {"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
        
       int daynumber;
       
       System.out.print("Enter day number(1-7) : ");
       daynumber = input.nextInt();
       
       for(int i=0; i<weekdays.length; i++){
           
           if(daynumber==i+1){//daynumber = 1 and i+1=1, so Saturday
               System.out.println(weekdays[i]);
           }
           
       }
        
        
    }
    
}
