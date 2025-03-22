
package com.mycompany.array;
import java.util.Scanner;

public class MatrixSum {
    
    public static void main(String[] args){
        
        Scanner input= new Scanner(System.in);
        
        int row, column;
        
        System.out.print("Enter row : ");
        row = input.nextInt();
        
        System.out.print("Enter column : ");
        column = input.nextInt();
        
        int[][] A = new int[row][column];
        int[][] B = new int[row][column];
        int[][] C = new int[row][column];
        
        //Getting input from User
        System.out.println("Enter elements for A matrix : ");
        
        for(int i=0; i<row; i++){
            
            for(int j=0; j<column; j++){
                
                System.out.printf("A[%d][%d] = ",i,j);
                A[i][j] = input.nextInt();
            }
        }
        
        System.out.println("Enter elements for B matrix : ");
        
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.printf("B[%d][%d] = ",i,j);
                B[i][j] = input.nextInt();
            }
        }
        
        System.out.println("\n\n A = \t\t");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                
                System.out.print(" "+A[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n\n B = \t\t");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
            
                System.out.print(" "+B[i][j]);
        }
            System.out.println();
        }
        
        System.out.println("\n\n A + B = \t\t");
        
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(" "+C[i][j]);
            }
            System.out.println();
        }
        input.close();
    }
    
}
