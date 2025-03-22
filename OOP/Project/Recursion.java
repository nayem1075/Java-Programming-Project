
package com.mycompany.oop;

public class Recursion {
    
    
    int fact(int n){
        
        if(n==1){
            return 1;
        }
        else{
          return n*fact(n-1);
        }
}
    
    public static void main(String[] args) {
        
        Recursion ob = new Recursion();
        int result = ob.fact(5);
        System.out.println("Factorial of 5 = "+result);
        
    }
}
