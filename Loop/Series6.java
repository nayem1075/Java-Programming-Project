
package com.mycompany.loop;
import java.util.Scanner;


public class Series6 {
    
    public static void main(String[] args){
        
        Scanner user = new Scanner(System.in);
        
        int n, result = 1;
        
        System.out.print("Enter last number : ");
        n = user.nextInt();
        
        for(int i=1; i<=n; i++){
            
            result = result *i;
        }
        System.out.println("1*2*3*4*.... = "+result);
    }
    
}
