
package com.mycompany.statickeyword;

public class StaticMethod1 {
   
    //Non static method
    void display1(){
        
        System.out.println("I am not static method.");
        
    }
    
    //Static method
    static void display2(){
        
        System.out.println("\nI am static method.");
        
    }
    
    //Common example for static method.No need to create object.
    public static void main(String[] args) {
        
        //Need to create object
        StaticMethod1 object1 = new StaticMethod1();
        object1.display1();
        
        //No need to create object
        StaticMethod1.display2();
    }
    
}
