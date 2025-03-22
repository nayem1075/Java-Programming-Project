
package com.mycompany.datatypes;
import java.util.Scanner;

public class Variable3 {
    public static void main(String[] args){//shortcut psvm enter
       
        Scanner input = new Scanner(System.in);//here input is variable name
        
       int number;
       System.out.print("Enter any number : ");
       number = input.nextInt();
       System.out.println("Number = "+number);
    }
    
}
