
package com.mycompany.logicaloperator;
import java.util.Scanner;

public class Assignment8 {
    
    public static void main(String[] args){
        
        Scanner User = new Scanner(System.in);
        
        char ans;
        
        System.out.println("Have yoy completed your masters?");
        System.out.print("Enter y/n : ");
        ans = User.next().charAt(0);
        System.out.println("Are you fluent in english?");
        System.out.print("Enter y/n : ");
        ans = User.next().charAt(0);
        
        if (ans=='y'){
            System.out.println("You are eligible for the job interview");
        }
        else{
            System.out.println("You are not eligible for the job interview");
        }
    }
    
}
