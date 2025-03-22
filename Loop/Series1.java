
package com.mycompany.loop;
import java.util.Scanner;


public class Series1 {
    
    public static void main(String[] args){
        
        Scanner User = new Scanner(System.in);
        
        int n,sum=0;
        
        System.out.print("Enter last number for series : ");
        n = User.nextInt();
        
        for(int i =1; i<=n; i++){
            
            sum = sum+i;
        }
        System.out.println("1 + 2+ 3+ ... = "+sum);
    }
    
}
