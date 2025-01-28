
package com.mycompany.bitwiseoperator;


public class Program2 {
    
    public static void main(String[] args) {
        
        int a = 32;
        int c;
        
        c = a>>3;//32/2 = 16/2= 8/2=4 
        System.out.println("a>>3 = "+c);
        
        c = a<<3;//32*2 = 64*2 = 128*2 = 256
        System.out.println("a<<3 = "+c);
        
    }
}
