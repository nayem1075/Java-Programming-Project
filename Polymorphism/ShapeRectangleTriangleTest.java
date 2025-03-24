
package com.mycompany.polymorphism;

public class ShapeRectangleTriangleTest {
    
    public static void main(String[] args){
        
        Shape[] s = new Shape[3];
        
        s[0] = new Shape();//No need this
        System.out.println(s[0].area());
        
        s[1] = new Rectangle(10,20);
        System.out.println(s[1].area());
        
        s[2] = new Triangle(2,10);
        System.out.println(s[2].area());
        
    }
}
