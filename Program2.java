
package com.mycompany.logicaloperator;
import java.util.Scanner;

public class Program2 {
    
    public static void main(String[] args){
        
        Scanner Input = new Scanner(System.in);
        
        char ch;
        
        System.out.print("Enter any letter : ");
        ch = Input.next().charAt(0);
        
        if(ch>='a' && ch<='z'){
            System.out.println("Small Letter");
        }
        else if(ch>='A' && ch<='Z'){
            System.out.println("Capital Letter");
        }
        else{
            System.out.println("Invalid letter");
        }
        
    }
    
}
