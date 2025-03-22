
package com.mycompany.loop;
import java.util.Scanner;

public class FibonacciSeries1 {

    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);
        
        int number, first=0, second=1, fibonacci;
        
        System.out.print("Enter How many numbers : ");
        number = Input.nextInt();
        
        System.out.print(first+" "+second);
        
        for(int i=3; i<=number; i++){
            
            fibonacci = first + second;
            System.out.print(" "+fibonacci);
            first = second;
            second = fibonacci;
            
        }
    }
    
}
