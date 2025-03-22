
package com.mycompany.array;
import java.util.Arrays;
import java.util.Scanner;

public class SortingInAscendingAndDescending2 {
    
    public static void main(String[] args){
        
        Scanner Input = new Scanner(System.in);
        
        int size;
        
        System.out.print("Enter how many numbers you write : ");
        size = Input.nextInt();
        
        int[] number = new int [size];

        for(int i=0; i<size; i++){
            
            System.out.printf("numbers[%d] : ",i);
            number[i] = Input.nextInt();   
        }        

        System.out.print("\n\nNumbers : ");
        for(int i=0; i<size; i++){
            
            System.out.print(" "+number[i]);
        }
        
        Arrays.sort(number);
        
        System.out.print("\n\nAscending : ");
        
        for(int i=0; i<size; i++){
            
            System.out.print(" "+number[i]);
        }
        System.out.print("\n\nDescending : ");
        
        for(int i=size-1; i>=0; i--){
            
            System.out.print(" "+number[i]);
        }
    }
    
}
