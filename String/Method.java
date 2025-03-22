
package com.mycompany.string;

public class Method {
    
    public static void main(String[] args){
        
        String s1 = "Nayem Uddin";
        String s2 = new String("Nayem Uddin");
        
        String s4 = "Nayem";
        String s5 = new String("Uddin");
        
        String s6 = "Nayem";
        String s7 = new String("nayem");
        
        int Length = s1.length();
        System.out.println("Length of S1 = "+Length);
        
        if(s1.equals(s2)){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not equals");
        }
        
        if(s4.contains(s5)){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not equals");
        }
        
        if(s6.equalsIgnoreCase(s7)){
            System.out.println("Equals");
        }
        else{
            System.out.println("Not equals");
        }
        
        boolean contains = s1.contains("Nay");
        System.out.println(contains);
        
        boolean b = s1.isEmpty();
        System.out.println("b = "+b);
    }
}
