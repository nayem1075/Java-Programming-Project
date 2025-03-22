
package com.mycompany.string;


public class StrinReverse1 {
    
    public static void main(String[] args){
        
        String s1 = "Nayem Uddin";
        
        StringBuffer sb = new StringBuffer(s1);
        
        String s2 = sb.reverse().toString();
        
        System.out.println("After reverse : "+s2);
        
    }
    
}
