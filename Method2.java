
package com.mycompany.string;


public class Method2 {
    
    public static void main(String[] args){
        
        String country = "Bangladesh is our country";
        System.out.println(country);
        
        String s3 = country.trim();//Space before and after
        System.out.println(s3);
        
        char ch = country.charAt(0);//Print first letter
        System.out.println("ch = "+ch);
        
        int value = country.codePointAt(0);//print ASCII value
        System.out.println("Value = "+value);
        
        int position = country.indexOf("is");//print Index of this first letter
        System.out.println("First position of is = "+position);
        
        position = country.lastIndexOf('n');//print last letter of n position like nan here last n position is 3
        System.out.println("last position of n = "+position);
        
    }
    
}
