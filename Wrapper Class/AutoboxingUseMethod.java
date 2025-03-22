
package com.mycompany.wrapperclass;

public class AutoboxingUseMethod {
    
    public static void main(String[] args){
        
        int i = 30;
        float f = 10.5f;
        double d = 25.52;
        long l = 1000202155;
        short s = 15;
        char c = 'a';
        
        Integer I = Integer.valueOf(i);
        Float F = Float.valueOf(f);
        Double D = Double.valueOf(d);
        Long L = Long.valueOf(l);
        Short S = Short.valueOf(s);
        Character C = Character.valueOf(c);
        
        System.out.println("I = "+I);
        System.out.println("F = "+F);
        System.out.println("D = "+D);
        System.out.println("L = "+L);
        System.out.println("S = "+S);
        System.out.println("C = "+C);
        
    }
    
}
