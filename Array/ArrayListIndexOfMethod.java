
package com.mycompany.array;
import java.util.ArrayList;

public class ArrayListIndexOfMethod {
    
    public static void main(String[] args){
        
        ArrayList<Integer> number = new ArrayList<>();
        
        //adding elements
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        
        System.out.println("ArrayList Contains : "+number);
        
        int position = number.indexOf(5);
        
        System.out.println("The index of 5 is : "+position);
        
    }
    
}
