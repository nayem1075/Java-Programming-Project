
package com.mycompany.loop;
import java.util.Scanner;


public class SumOfNumber1 {
     public static void main(String[] args){
         
        Scanner Input = new Scanner(System.in);
       
        int StartingNumber, EndingNumber, SumOfOddNumber=0, SumOfEvenNumber=0;
        
        System.out.print("Enter Starting number : ");
        StartingNumber = Input.nextInt();
        
        System.out.print("Enter Ending number : ");
        EndingNumber = Input.nextInt();
        
        for(int i=StartingNumber; i<=EndingNumber; i++){
            
            if(i%2==0){
                SumOfEvenNumber = SumOfEvenNumber + i;
            }
          
            if(i%2!=0){
                SumOfOddNumber = SumOfOddNumber + i;
            } 
        }
            System.out.println("Sum of Even numbers = "+SumOfEvenNumber);
            System.out.println("Sum of Odd numbers = "+SumOfOddNumber);
     }
    
    
}
