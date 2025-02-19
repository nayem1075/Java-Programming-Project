
package com.mycompany.string;


public class StringBuffer1 {
    
    public static void main(String[] args){
        
        StringBuffer sb = new StringBuffer("Nayem");
        
        System.out.println("sb = "+sb);
        
        sb.append(" Uddin ");
        sb.append(25);
        
        System.out.println("sb = "+sb);
        
        sb.reverse();
        System.out.println(sb);

        
    }
}
