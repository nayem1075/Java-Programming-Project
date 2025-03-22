
package com.mycompany.bitwiseoperator;
import java.util.Scanner;


public class Program1 {
    
    public static void main(String[] args){
        
        Scanner User = new Scanner(System.in);
        
        int a,b,c;
        
        System.out.print("Enter two decimal number : ");
        a = User.nextInt();
        b = User.nextInt();
        
        c = a&b;
        System.out.println("a & b = "+c);//Answer in Binary
        
        c = a|b;
        System.out.println("a | b = "+c);//Answer in Binary
        
        c = a ^ b;
        System.out.println("a ^ b = "+c);//Answer in Binary
        
    }
    
}
