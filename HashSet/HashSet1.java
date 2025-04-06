
package com.mycompany.hashset;

import java.util.HashSet;

public class HashSet1 {
    
    public static void main(String[] args) {
  
    HashSet<String> fruitsName = new HashSet<String>();
    
    fruitsName.add("Apple");
    fruitsName.add("Strwbary");
    fruitsName.add("Banana");
    fruitsName.add("Orange");
    fruitsName.add("Mango");
    
        System.out.println(fruitsName);
        System.out.println("Size of HashSet : "+fruitsName.size());
    
        fruitsName.remove("Banana");
        
        System.out.println(fruitsName);

        
        fruitsName.clear();
        System.out.println(fruitsName);
        
        boolean value = fruitsName.isEmpty();
        System.out.println(value);
  }
}
