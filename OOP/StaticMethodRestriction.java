
package com.mycompany.statickeyword;

public class StaticMethodRestriction {
    
    static void display1(){
        
        //Here Static method access Static Method
        display3();
        System.out.println("Static method1.\n");
    }
   
    void display2(){
        //Here Not static method access static method
        display1();
        System.out.println("Non static method.\n");
    }
    
    static void display3(){
        
        //Here not access non static method
        //display2();
        System.out.println("Static method2.\n");
        
    }
    
    public static void main(String[] args) {
        
        StaticMethodRestriction s1 = new StaticMethodRestriction();
        s1.display2();
        
        StaticMethodRestriction.display1();
        StaticMethodRestriction.display3();
        
    }
    
}
