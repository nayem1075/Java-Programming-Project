
package com.mycompany.array;
import java.util.Scanner;

public class SumAndAverage {
    
    public static void main(String[] args){
        
        Scanner Input = new Scanner(System.in);
        
        double sum=0;
        double [] number = new double[5];
        System.out.println("Please enter 5 numbers : ");
        number[0] = Input.nextDouble();
        number[1] = Input.nextDouble();
        number[2] = Input.nextDouble();
        number[3] = Input.nextDouble();
        number[4] = Input.nextDouble();
        
        sum = number[0] + number[1] + number[2] + number[3] + number[4];
        
        System.out.println("The sum is : "+sum);
        
        double average = sum/5;
        
        System.out.println("The average = "+average);
    }
    
    
    
}
