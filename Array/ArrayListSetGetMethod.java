
package com.mycompany.array;
import java.util.ArrayList;

public class ArrayListSetGetMethod {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<>();
        
        number.add(0, 1);
        number.add(1, 2);
        number.add(2, 3);
        number.add(3, 4);
        
        System.out.println("ArrayList Contains : "+number);
        
        number.set(2, 12);
        System.out.println("After setting : "+number);
        
       int get =  number.get(3);
        System.out.println("index 3 = "+get);     
        
    }
    
}
