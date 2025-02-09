
package com.mycompany.array;
import java.util.Scanner;

public class SumAndAverageUsingLoop {
    
    public static void main(String[] args){
        
        Scanner User = new Scanner(System.in);
        
        double [] number = new double[5];
        double sum = 0, avg;
        
        System.out.print("Enter 5 numbers : ");
        for(int i=0; i<5; i++){
            number[i] = User.nextDouble();
        }
        for(int i=0; i<5; i++){
            sum = sum + number[i];
        }
        avg = sum/5;
        
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+avg);
        
    }
    
}
