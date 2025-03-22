
package com.mycompany.pattern;
import java.util.Scanner;

public class RightTriangle2 {
    
    public static void main(String[] args){
        
        Scanner User = new Scanner(System.in);
        
        int number, row, column;
        
        System.out.print("Enter a number to draw a pattern : ");
        number = User.nextInt();
        
        for(row=1; row<=number; row++){
            for(column=1; column<=number - row; column++){
                System.out.print(" ");
            }
            for(column=1; column<=row; column++){
                System.out.print(row);
            }
            System.out.println();
        }
    }
    
}
