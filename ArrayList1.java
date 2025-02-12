
package com.mycompany.array;

import java.util.ArrayList;


public class ArrayList1 {
    
    public static void main(String[] args){
        
        //Data type like Integer I is capital letter
        ArrayList<Integer> number = new ArrayList<Integer>();
        
        System.out.println("Size = "+number.size());
        
        //adding elements
        number.add(10);//adding just number
        number.add(20);
        number.add(30);
        number.add(3, 40);
        
        System.out.println(number);
        
        System.out.println("Size = "+number.size());
        
         //Removing elements
        number.remove(3);
        System.out.println("After removing ArrayList contains : "+number);
        
        number.removeAll(number);
        System.out.println("After removing all ArrayList contains : "+number);
    }
}
