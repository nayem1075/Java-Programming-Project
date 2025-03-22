
package com.mycompany.loop;
import java.util.Scanner;

public class FibonacciSeries {
    
    public static void main(String[] args){
        
        Scanner User = new Scanner(System.in);
        
        int number, first=0, second=1, Fibonacci;
        
        System.out.print("Enter how many numbers you find Fibonacci Series : ");
        number = User.nextInt();
        
        for(int i=0; i<number; i++){
            
            System.out.print(first+" ");
            
            Fibonacci = first + second;
            first = second;
            second = Fibonacci;   
        }
        User.close();
    }
    
}
