
package com.mycompany.string;


public class StringBuilder3 {
    
    public static void main(String[] args){
        
        String s1 = "Nayem Uddin";
        
        StringBuilder sb = new StringBuilder(s1);
        System.out.println("Before delete : "+sb);
        
        sb.delete(2, 5);
        System.out.println("After delete some letter : "+sb);
        
    }
    
}
