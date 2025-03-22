
package com.mycompany.array;

import java.util.Arrays;


public class SortingInAscendingAndDescending1 {
    
    public static void main(String[] args){
        
        String[] names = {"Nayem","Ainan","Masud","Fahad","Shihab"};
        
        Arrays.sort(names);
        
        System.out.print("Ascending : ");
        
        for(int i=0; i<5; i++){
            
            System.out.print(" "+names[i]);
        }
        
        System.out.print("\n\nDescending : ");
        
        for( int i=4; i>=0; i--){
            
            System.out.print(" "+names[i]);
            
        }
    }
    
}
