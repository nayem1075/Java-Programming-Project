
package com.mycompany.statementswitch;
import java.util.Scanner;

public class Assignment9 {
    
    public static void main(String[] args){
        
        Scanner User = new Scanner(System.in);
        
        int option;
        System.out.print("Choose an option : ");
        option = User.nextInt();
        
        switch(option){
            
            case 1:
                System.out.println("Selected Language is Bengali");
                break;
            case 2: 
                System.out.println("Selected Language is Hindi");
                break;
            case 3:
                System.out.println("Selected Language is Urdu");
                break;
            default:
                System.out.println("Selected Language is English");
            
        }
        
        
    }
    
}
