
package com.mycompany.loop;
import java.util.Scanner;

public class Assignment13 {
    
    public static void main(String[] args){
        
        Scanner User =  new Scanner(System.in);
        
        String Username, Password;
        
        
        while(true){
            
            System.out.print("Enter Username : ");
            Username = User.nextLine();
            System.out.print("Enter Password : ");
            Password = User.nextLine();
 
        if(Username.equals("Nayem1075") && Password.equals("nayem@622%")){
        System.out.println("Welcome to the System");
        break;
        }
        else{
            System.out.println("Username Or Password is Incorrect. Please try again!");
        }
      }
        User.close();
    }
    
}
