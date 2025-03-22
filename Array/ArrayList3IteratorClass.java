
package com.mycompany.array;
import java.util.Iterator;
import java.util.ArrayList;

public class ArrayList3IteratorClass {
    
    public static void main(String[] args){
        
        ArrayList<Integer> number = new ArrayList<>();
        
        System.out.println("Size = "+number.size());
        
        number.add(100);
        number.add(200);
        number.add(300);
        number.add(400);
        number.add(4, 500);
        //It is a method to print ArrayList
        Iterator Input = number.iterator();
        
        System.out.print("Number : ");
        while(Input.hasNext()){
            
            System.out.print(" "+Input.next());
        }
        System.out.println("\n\nSize = "+number.size());
        
        //Removing elements
        number.remove(3);
        System.out.println("After removing ArrayList contains : "+number);
        
        number.removeAll(number);
        System.out.println("After removing all ArrayList contains : "+number);
    }
    
}
