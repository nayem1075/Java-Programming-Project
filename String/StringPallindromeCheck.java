
package com.mycompany.string;


public class StringPallindromeCheck {
    
    public static void main(String[] args){
        
        String s1 = "madam";
        
        StringBuffer sb = new StringBuffer(s1);
        String s2 = sb.reverse().toString();
        
        if(s1.equals(s2)){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not Pallindrome");
        }
    }
    
}
