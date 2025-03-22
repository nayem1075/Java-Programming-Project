
package com.mycompany.loop;
import java.util.Scanner;

public class PrimeNumberCheck {
    
    public static void main(String[] args){
        
        Scanner Scan = new Scanner(System.in);
        
        System.out.print("Enter any number : ");
        int num = Scan.nextInt();
        int count = 0;
        
        if(num<=1){
            count++;
        }
        else{
        for(int i=2; i<num/2; i++){
            
            if(num%i==0){
                count++;
                break;
            }
        }
        }
        if(count==0){
            System.out.println(num+" is a Prime number");
            
        }
        else{
            System.out.println(num+" is not a Prime number");
        }
        
    }
    
}
