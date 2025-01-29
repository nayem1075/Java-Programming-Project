
package com.mycompany.loop;
import java.util.Scanner;

public class Series5 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int n,sum=0;
        
        System.out.print("Enter last number : ");
        n = input.nextInt();
        
        int i=1;
        while(i<=n){
            sum = sum + i*i;
            i++;
        }
        System.out.println("1^2 + 2^2 + 3^2+ .... = "+sum);
    }
}
