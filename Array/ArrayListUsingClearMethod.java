
package com.mycompany.array;
import java.util.ArrayList;

public class ArrayListUsingClearMethod {
 
    public static void main(String[] args){
        
        ArrayList<Integer> number = new ArrayList<>();
        
        //adding elements
        
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(3, 3);
        number.add(4, 4);
        
        System.out.println("ArrayList Contains = "+number);
        System.out.println("\n\nSize = "+number.size());
        
        number.clear();//kind of number.remove(index number);
        
        System.out.println("ArrayList after clear contains : "+number);
        
        
        
    }
    
}
