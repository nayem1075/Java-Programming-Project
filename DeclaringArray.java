
package com.mycompany.array;

public class DeclaringArray {
    
    public static void main(String[] args){
        
        int[]number = new int[5];
        int[]number2 = new int[5];
                                        /* or create
                                         int [] number;
                                         number = new int[5];  
                                        */
      
    number[0] = 10;
    number[1] = 20;
    number[2] = 30;
    number[3] = 40;
    number[4] = 50;
    
    number2[0] = 60;
    number2[1] = 70;
    number2[2] = 80;
    number2[3] = 90;
    number2[4] = 100;

    System.out.println(number[0]);
    System.out.println(number2[4]);
    
    int len = number.length;
    int len2 = number2.length;
    
    int sum = number[0] + number[1] + number[2] + number[3] + number[4];
    
        System.out.println("Size of array for number variable = "+len);
        System.out.println("Size of array for number2 variable = "+len2);
        
        System.out.println("Sum of array for number = "+sum);
    }
}
