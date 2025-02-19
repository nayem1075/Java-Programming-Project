
package com.mycompany.string;

public class StringBuffer3 {
    
    public static void main(String[] args){
        
        String s1 = "Nayem Uddin";
        StringBuffer sb = new StringBuffer(s1);
        
        System.out.println("Before set length : "+sb);
        
        sb.setLength(5);
        System.out.println("After set length : "+sb);
        
    }
}
