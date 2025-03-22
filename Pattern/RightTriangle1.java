
package com.mycompany.pattern;
import java.util.Scanner;

public class RightTriangle1 {
    
    public static void main(String[] args){
        
        Scanner Input = new Scanner(System.in);
        
        int number, row, column;
        
        System.out.print("Enter number to draw a pattern : ");
        number = Input.nextInt();
        
        for(row = 1; row<= number; row++){
            
            for(column = 1; column<=number - row; column++){
                
                System.out.print(" ");
            }
               for(column = 1; column<=row; column++){ 
                System.out.print(column);
            }
            System.out.println();
        }
    }
    
}
