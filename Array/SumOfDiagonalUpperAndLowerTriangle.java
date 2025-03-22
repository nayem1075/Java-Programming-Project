
package com.mycompany.array;
import java.util.Scanner;

public class SumOfDiagonalUpperAndLowerTriangle {
    
    public static void main(String[] args){
        
        Scanner User = new Scanner(System.in);
        
        int row,column; 
        int SumOfDiagonalElement = 0;
        int SumOfUpperTriangle = 0;
        int SumOfLowerTriangle = 0;
        
        System.out.print("Enter row for the matrix : ");
        row = User.nextInt();
        System.out.print("Enter column for the matrix : ");
        column = User.nextInt();
        
        int [][] Matrix = new int[row][column];
        
        System.out.println("Enter elements for the matrix : ");
        
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                
                System.out.printf("Matrix[%d][%d] = ",i,j); 
                Matrix[i][j] = User.nextInt();
            }
        }
        
        System.out.println("\n\nMatrix = ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                 
                System.out.print(" "+Matrix[i][j]);
            }
            System.out.println();
        }  
        
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                
                if(i==j){
                    
                    SumOfDiagonalElement = SumOfDiagonalElement + Matrix[i][j];
                }
                if(i<j){
                    
                    SumOfUpperTriangle = SumOfUpperTriangle + Matrix[i][j];
                }
                if(i>j){
                    SumOfLowerTriangle = SumOfLowerTriangle + Matrix[i][j];
                }
                
            }
        }
        System.out.println("Sum Of Diagonal Elements = "+SumOfDiagonalElement);
        System.out.println("Sum Of Upper Triangle Elements = "+SumOfUpperTriangle);
        System.out.println("Sum Of Lower Triangle Elements = "+SumOfLowerTriangle);
    }
    
}
