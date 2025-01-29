
package com.mycompany.loop;
import java.util.Scanner;


public class Series2 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int n, sum=0;
        
        System.out.print("Enter last number : ");
        n = input.nextInt();
        
        for(int i=1; i<=n; i=i+2){
            sum = sum + i;
        }
        System.out.println("1 + 3 + 5 +.... = "+sum);
    }
}
