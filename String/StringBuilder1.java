
package com.mycompany.string;


public class StringBuilder1 {
    
    public static void main(String[] args){
        
        String s1 = "Nayem";
        StringBuilder sb = new StringBuilder(s1);
        
        System.out.println("sb = "+sb);
        
        sb.append( " Uddin ");
        
        System.out.println(sb);

        sb.append(20);
        sb.append(" "+12.5 );
        System.out.println(sb);
        
    }
}
