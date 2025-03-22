
package com.mycompany.loop;
import java.util.Scanner;


public class Series9 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int n;
        float result = 1f;
        
        System.out.print("Enter last number : ");
        n = input.nextInt();
        
        float i = 1.5f;
        while(i<=n){
            result = result*i;
            i = i+1.0f;  
        }
        System.out.println("1.5*2.5*3.5*.... = "+result);
    }
    
}
