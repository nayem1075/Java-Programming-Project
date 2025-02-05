
package com.mycompany.pattern;

import java.util.Scanner;

public class CombinedTriangle5 {
     public static void main(String[] args){
        
        Scanner User = new Scanner(System.in);
        
        int number, row, column;
        
        System.out.print("Enter number to draw a pattern : ");
        number = User.nextInt();
        
        for(row=1; row<=number; row++){
            for(column=1; column<=row; column++){
                
                System.out.print((char)(row+64));
            }
            System.out.println();
        }
        for(row=number-1; row>=1; row--){
            for(column=1; column<=row; column++){
                
                System.out.print((char)(row+64));
            }
            System.out.println();
        }
    }
}
