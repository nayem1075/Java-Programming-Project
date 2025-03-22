
package com.mycompany.unaryoperator;


public class Program4 {
    
    public static void main(String[] args) {
        
        int x = 15;
        int y;
        
        y = x--;//Postfix Decreement y = 15
        System.out.println("y = "+y);
        y = x;//y = 14
        System.out.println("y = "+y);
    }
    
}
