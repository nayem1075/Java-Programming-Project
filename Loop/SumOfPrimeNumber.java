
package com.mycompany.loop;
import java.util.Scanner;

public class SumOfPrimeNumber {

    public static void main(String[] args){
        
        Scanner Input = new Scanner(System.in);
        
        int number, InitialNumber, FinalNumber, count=0, TotalPrimeNumber=0, SumOfPrimeNumber=0;
        
        System.out.print("Enter Initial Number : ");
        InitialNumber = Input.nextInt();
        
        System.out.print("Enter Final Number : ");
        FinalNumber = Input.nextInt();
        
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
                TotalPrimeNumber++;
                SumOfPrimeNumber= SumOfPrimeNumber + number;
            }
        }
        System.out.println("Total Prime number = "+TotalPrimeNumber);
        System.out.println("Sum Of Prime number = "+SumOfPrimeNumber);
        Input.close();
                
    }
    
}
