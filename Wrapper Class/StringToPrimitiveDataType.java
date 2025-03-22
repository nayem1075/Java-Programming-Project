
package com.mycompany.wrapperclass;

public class StringToPrimitiveDataType {
    
    public static void main(String[] args){
        
        String s1 = "32";
        int i = Integer.parseInt(s1);
        System.out.println("i = "+i);
        
        String s2 = "10.5";
        double d = Double.parseDouble(s2);
        System.out.println("d = "+d);
        
        String s3 = "true";
        boolean b = Boolean.valueOf(s3);
        System.out.println("b = "+b);
        
        String s4 = "3.5";
        float f = Float.valueOf(s4);
        System.out.println("f = "+f);
        
    } 
}
