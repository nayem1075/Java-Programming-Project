
package com.mycompany.logicaloperator;
import java.util.Scanner;

public class Assignment7 {
    
    public static void main(String[] args){
        
        Scanner User = new Scanner(System.in);
        
        System.out.println("Do you love java?");
        
        char ch;
        System.out.print("Enter y/Y/n/N : ");
        ch = User.next().charAt(0);
        
        if (ch=='y'||ch=='Y'){
            System.out.println("You are a java Lover");
        }
        else if(ch=='n'||ch=='N'){
            System.out.println("You are not a java lover");
        }
        else{
            System.out.println("Please select y/Y/n/N");
        }
        
    }
    
}
