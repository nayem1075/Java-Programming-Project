
package com.mycompany.array;
import java.util.Scanner;

public class Matrix {
    
    public static void main(String[] args){
        
        Scanner User = new Scanner(System.in);
        
        int row, column;
        
        System.out.print("Enter row for the matrix : ");
        row = User.nextInt();
        System.out.print("Enter column for the matrix : ");
        column = User.nextInt();
        
        int [][] A = new int[row][column];
        int [][] B = new int[row][column];
        
        //Getting Input from User
        System.out.println("Enter element for A matrix : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                
                System.out.printf("A[%d][%d] = ",i,j);
                A[i][j] = User.nextInt();
            }
        }
        
        System.out.println("Enter element for B matrix : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.printf("B[%d][%d] = ",i,j);
                B[i][j] = User.nextInt();
            }
        }
        
        System.out.println("\n\nA = \t");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(" "+A[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("\nB = \t");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(" "+B[i][j]);
            }
            System.out.println();
        }
        User.close();
    }
    
}
