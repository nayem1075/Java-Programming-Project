
package com.mycompany.wrapperclass;


public class WrapperClass1 {

    public static void main(String[] args){
        
        //Primitive to object (Autoboxing)
        
        
        int x = 30;
        Integer y = Integer.valueOf(x);
        System.out.println("y = "+y);
        
        Integer p = x;//Integer.valueOf(x) {It's called autoboxing without use valueOf method}
        System.out.println("p = "+p);
    }
    
}
