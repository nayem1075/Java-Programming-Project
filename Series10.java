
package com.mycompany.loop;
import java.util.Scanner;

public class Series10 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int n, result=1;
        
        System.out.print("Enter last number : ");
        n = input.nextInt();
        
        int i=1;
        
        while(i<=n){
            result = result * i*i;
            i++;
        }
        System.out.println("1^2 * 2^2 * 3^2 * ..... = "+result);
    }
    
}
