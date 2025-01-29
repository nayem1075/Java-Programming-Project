
package com.mycompany.loop;
import java.util.Scanner;


public class SumOfNumber {
    
    public static void main(String[] args){
        
        Scanner Input = new Scanner(System.in);
        
        int StartingNumber, EndingNumber, sum=0;
        
        System.out.print("Enter Starting number : ");
        StartingNumber = Input.nextInt();
        
        System.out.print("Enter Ending number : ");
        EndingNumber = Input.nextInt();
        
        for(int i= StartingNumber; i<=EndingNumber; i=i+2){
            
            sum = sum+i;
            
        }
        System.out.println("Sum = "+sum);
    }
    
}
