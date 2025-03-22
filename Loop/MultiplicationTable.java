
package com.mycompany.loop;
import java.util.Scanner;

public class MultiplicationTable {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int InitialNumber, FinalNumber;
        
        System.out.print("Enter Initial Number : ");
        InitialNumber = input.nextInt();
        
        System.out.print("Enter Final Number : ");
        FinalNumber = input.nextInt();
        
        for(int i=InitialNumber; i<=FinalNumber; i++){
            
            for(int j=1; j<=10; j++){
                System.out.println(i+" X "+j +" = "+i*j);//Say 5*7=35 here i is 5 and j is 7
            }
            System.out.println("\n\n");
            
        }
        
        
        
    }
    
}
