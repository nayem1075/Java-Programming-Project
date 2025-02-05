
package com.mycompany.pattern;

import java.util.Scanner;


public class Triangle11 {
     public static void main(String[] args){
        
        Scanner User = new Scanner(System.in);
        
        int number, row, column;
        
        System.out.print("Enter number to draw a pattern : ");
        number = User.nextInt();
        
        for(row=1; row<=number; row++){
            
            for(column=1; column<=row; column++){
                
                System.out.print(row%2);
            }
            System.out.println();
        }
}

}
