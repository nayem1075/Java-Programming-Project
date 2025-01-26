
package com.mycompany.operator;
import java.util.Scanner;

public class Assignment4 {
    
    public static void main(String[] args){
        
        Scanner Input = new Scanner(System.in);
        
        int price, InstallmentPermonth;
       
        
        System.out.print("Enter the price of your product : ");
        price = Input.nextInt();
        
        System.out.print("Enter the month of Installment : ");
        InstallmentPermonth = Input.nextInt();
        
        
        double Installment = (double) price / InstallmentPermonth;        
   
        System.out.println("Number of Installment : "+Installment);
        
    }
}
