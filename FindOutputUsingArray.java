
package com.mycompany.array;
import java.util.Scanner;

public class FindOutputUsingArray {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int row, column, k=0;
        
        System.out.print("Enter row and column of the matrix : ");
        row = input.nextInt();
        column = input.nextInt();
        
        int [][] array = new int[row][column];
        
        //Assigning the value
        for(int i=0; i<row; i++){
            
            for(int j=0; j<column; j++){
                
                array[i][j] = k;//Start with 0 and then increement
                k++;           
            }
        }
        
        //Printing the value
        System.out.println("Array = ");
        for(int i=0; i<row; i++){
            
            for(int j=0; j<column; j++){
                
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }
    }
    
}
