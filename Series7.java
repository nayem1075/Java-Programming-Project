
package com.mycompany.loop;
import java.util.Scanner;


public class Series7 {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int n, result = 1;
        
        System.out.print("Enter last number : ");
        n = input.nextInt();
        
        for(int i=1; i<=n; i=i+2){
            
            result = result*i;
        }
            System.out.println("1*3*5*7*.... = "+result); 
        
    }
    
}
