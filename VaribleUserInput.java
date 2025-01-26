
package com.mycompany.datatypes;
import java.util.Scanner;

public class VaribleUserInput {
    
    public static void main(String[] args){

Scanner User = new Scanner(System.in);

      String name;
      
      System.out.print("Enter your name : ");
              name = User.nextLine();
              System.out.println("Welcome : "+name);
        
    }
    
}
