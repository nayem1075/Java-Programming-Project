
package com.mycompany.hashmap;

import java.util.HashMap;

public class HashMap1 {
    
    public static void main(String[] args) {
        
     //put,get   
     HashMap <Integer,String> customer = new HashMap <Integer,String>();   

     customer.put(101, "Nayem");
     customer.put(102, "Rahim");
     customer.put(103, "Karim");
     
        System.out.println(customer.get(101));
        System.out.println(customer.get(102));
        System.out.println(customer.get(103));
     
    }
}
