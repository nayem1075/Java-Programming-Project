
package com.mycompany.array;
import java.util.Scanner;

public class SumAndAverageUsingLoopWithLength {
    
    public static void main(String[] args){
        
        Scanner Input = new Scanner(System.in);
        
        double [] number = new double [5];
        double sum=0, avg;
        
        System.out.print("Enter 5 numbers : ");
        
        for(int i=0; i<number.length; i++){
            
            number[i] = Input.nextDouble(); 
        }
        
        for(int i=0; i<number.length; i++){
            
            sum = sum + number[i];
        }
        avg = sum/5;
        
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+avg);
        
    }
    
}
