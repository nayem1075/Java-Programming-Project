
package com.mycompany.linkedlist;

import java.util.LinkedList;


public class LinkedList2 {
   
    public static void main(String[] args) {
        
        LinkedList<Integer> number = new LinkedList<>();
        
        number.add(100);
        number.add(200);
        number.add(300);
        number.add(400);
        number.add(500);
        //Initialize different type.
        number.add(5, 600);
        number.addFirst(50);
        number.addLast(650);
        
        number.remove(2);
        
        //number.removeFirst();
        //number.removeLast();

   
        
        for (int x : number){
            System.out.println(x);
        }
        
        System.out.println("Size of the List : "+number.size()); 
        
         System.out.println("First element : "+number.getFirst());
         System.out.println("Last element : "+number.getLast());
         
         number.clear();
         System.out.println(number);

    }
    
}
