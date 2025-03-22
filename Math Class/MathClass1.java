
package com.mycompany.mathclass;


public class MathClass1 {
    
    public static void main(String[] args) {
        
        int x = 20;
        int y = -10;
     
     int max = Math.max(x, y);
     int min = Math.min(x, y);
     
     System.out.println("Maximum number : "+max);
     System.out.println("Minimum number : "+min);
     
     int absolute = Math.abs(y);
     System.out.println("Absolute of Y = "+absolute);
     
     int a = 2;
     int b = 3;
    
     double power = Math.pow(a,b);
     System.out.println("Power of a,b is : "+power);
     
     int round = Math.round(8.4f);
     System.out.println("Round of 8.4 is : "+round);//8.8 = 9 or 8.4 = 8
     
     double pi = Math.PI;
     System.out.println("PI = "+pi);
     
    }
    
}
