
package com.mycompany.string;

public class Method3 {
    
    public static void main(String[] args){
        
        String s1 = "This is my country";
        System.out.println("S1 = "+s1);
        
        String s2 = s1.replace('i', 'j');
        
        System.out.println("S2 = "+s2);
        
        String country1 = "Bangladesh is our country";
        System.out.println("Country1 = "+country1);
        
        String country2 = country1.replaceAll("Bangladesh", "Argentina");
        System.out.println("Country2 = "+country2);
        
        String[] s3 = s1.split(" ");
        
        for(String x : s3){
            System.out.println(x);
        }
        
    }
    
}
