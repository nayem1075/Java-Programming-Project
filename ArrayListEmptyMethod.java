
package com.mycompany.array;
import java.util.ArrayList;

public class ArrayListEmptyMethod {
    
    public static void main(String[] args){
        
        ArrayList<Integer> number = new ArrayList<>();
        
        //adding elements
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        
        System.out.println("ArrayList Contains : "+number);
        
        System.out.println("\n\nSize = "+number.size());
        
        boolean check = number.isEmpty();
        System.out.println("ArrayList Empty : "+check);
        
        number.clear();
        
        System.out.println("ArrayList Empty after clear all : "+number.isEmpty());
        
        
    }
    
}
