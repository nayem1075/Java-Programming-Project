
package com.mycompany.wrapperclass;

public class UnboxingWithoutMethod {
    
    public static void main(String[] args){
        
        Integer I = new Integer(10);
        Float F = new Float(10.2);
        Double D = new Double(10.2365);
        Long L = new Long(10325332);
        Character C = new Character('a');
        
        int i = I;
        float f = F;
        double d = D;
        long l = L;
        char c = C;
        
        System.out.println("i = "+i);
        System.out.println("f = "+f);
        System.out.println("d = "+d);
        System.out.println("l = "+l);
        System.out.println("c = "+c);
        
    }
}
