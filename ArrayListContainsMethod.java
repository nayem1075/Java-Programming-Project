
package com.mycompany.array;
import java.util.ArrayList;


public class ArrayListContainsMethod {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<>();
        
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        
        boolean check = number.contains(40);
         System.out.println("40 is in the list : "+check);
         
         boolean check1 = number.contains(50);
         System.out.println("50 is in the list : "+check1);
        
        
    }
    
}
