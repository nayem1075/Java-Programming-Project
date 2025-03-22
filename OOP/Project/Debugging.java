
package com.mycompany.oop;

public class Debugging {
    
    public static void main(String[] args) {
        
        int sum = 0;
        
        //Use debug - new watch and new breakpoints.
        for(int i=1; i<=10; i++){
            sum = sum + i;
        }
        
        System.out.println("Sum is : "+sum);
        
    }
}
