
package com.mycompany.mathclass;

public class MathClassMethod {
    
    public static void main(String[] args) {
        
        int abs = Math.abs(-9);// - 9 absulate value +9
        System.out.println("Absolute value of -9 = "+abs);
        
        float abs1 = Math.abs(-2.5f);
        System.out.println("Absolute value of -2.5 = "+abs1);
        
        System.out.println("Absolute value = "+Math.abs(-2.53));

        System.out.println("Square root = "+Math.sqrt(16));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.PI);
        System.out.println(Math.log(2));
        System.out.println(Math.exp(1));
        System.out.println(Math.max(25, 30));
        System.out.println(Math.min(25, 30));
        System.out.println(Math.ceil(5.2));
        System.out.println(Math.floor(2.6));
        
    }
    
}
