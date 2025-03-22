
package com.mycompany.array;
import java.util.ArrayList;

public class ArrayList2 {
    
    public static void main(String[] args){
        
        ArrayList<Integer> number = new ArrayList<Integer>();
        
        System.out.println("Size = "+number.size());
        
        //adding elements
        
        number.add(5);
        number.add(10);
        number.add(15);
        number.add(20);
        number.add(4, 25);
        
        //Using for each loop 
        //for each loop is too easy
        System.out.print("Number list = ");
         for(int x : number){
             
             System.out.print(" "+x);
         }
        
         System.out.println("\n\nSize = "+number.size());
         
          //Removing elements
        number.remove(3);
        System.out.println("After removing ArrayList contains : "+number);
        
        number.removeAll(number);
        System.out.println("After removing all ArrayList contains : "+number);
    }
    
}
