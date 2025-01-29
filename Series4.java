
package com.mycompany.loop;
import java.util.Scanner;


public class Series4 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
       float n,sum=0;
        System.out.print("Enter last number : ");
        n = input.nextInt();
        
        for(float i=1.5f; i<=n; i++){
            
            sum = sum+i;
            
        }
        System.out.println("1.5 + 2.5 + 3.5+... = "+sum);
    }
    
}
