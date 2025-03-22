
package com.mycompany.array;

import java.util.Arrays;

public class SortingInAscendingAndDescending {
    
    public static void main(String[] args){
        
        int[] number = {10,-3,18,5,25,35};
        
       Arrays.sort(number);
        
        System.out.print("Ascending : ");
        for(int i=0; i<6; i++){
            
            System.out.print(" "+number[i]);
        }
     
        System.out.print("\n\nDescending : ");
       for(int i=5; i>=0; i--){
           
           System.out.print(" "+number[i]);
           
       }
        
    }
}
