
package com.mycompany.wrapperclass;


public class WrapperClass2 {
    
    public static void main(String[] args){
        
         
    //object to primitve (Unboxing)
    
    Double d = new Double(10.25);
        System.out.println("d = "+d);
        
        double e = d.doubleValue();
        System.out.println("e = "+e);
        
          double f = d;//Without use any method
        System.out.println("f = "+f);
        
        
        
    }
}
