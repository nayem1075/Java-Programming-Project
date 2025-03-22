
package com.mycompany.wrapperclass;


public class UnboxingUseMethod {
    
    public static void main(String[] args) {
        
        Integer I = new Integer(10);
        Float F = new Float(10.5);
        Double D = new Double(25.235);
        Long L = new Long(1023252);
        Character C = new Character('a');
        
        int i = I.intValue();
        float f = F.floatValue();
        double d = D.doubleValue();
        long l = L.longValue();
        char c = C.charValue();
        
        System.out.println("i = "+i);
        System.out.println("f = "+f);
        System.out.println("d = "+d);
        System.out.println("l = "+l);
        System.out.println("c = "+c);
        
        
        
    }
    
}
