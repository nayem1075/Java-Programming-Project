
package com.mycompany.string;


public class StringBuffer2 {
    
    public static void main(String[] args){
        
        StringBuffer sb = new StringBuffer("Nayem Uddin");
        
        System.out.println("Before delete : "+sb);
        
        sb.delete(0, 5);
        System.out.println("After delete some letter : "+sb);
        
        
    }
    
}
