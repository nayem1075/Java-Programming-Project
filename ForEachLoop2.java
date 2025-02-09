
package com.mycompany.array;

public class ForEachLoop2 {
    
    public static void main(String[] args){
        
        int [] number = {10,20,30,40,50,60,70,80,90,100};
        
        int sum = 0;
        
        for(int total : number){
            
            sum = sum + total;
        }
        System.out.println("Sum = "+sum);
    }
}
