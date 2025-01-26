
package com.mycompany.ifelse;
import java.util.Scanner;


public class CapitalSmall {
    
    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);
        
        char ch;
        
        System.out.print("Enter any letter : ");
        ch = Input.next().charAt(0);
        
        if(ch>='a' && ch<='z'){
            System.out.println("The letter is Small");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("The letter is Capital");
        }
        else{
            System.out.println("Invalid Letter");
        }   
    }
    
}
