
package com.mycompany.wrapperclass;


public class PrimitiveToStringDataType {
    
    public static void main(String[] args){
        
        int i = 100;
        String s1 = Integer.toString(i);
        System.out.println("S1 = "+s1);
        
        double d = 10.5;
        String s2 = Double.toString(d);
        System.out.println("S2 = "+s2);
        
        float f = 2.5f;
        String s3 = Float.toString(f);
        System.out.println("S3 = "+s3);
   
    }
}
