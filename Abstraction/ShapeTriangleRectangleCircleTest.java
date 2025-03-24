
package com.mycompany.abstraction;

public class ShapeTriangleRectangleCircleTest {
    
     public static void main(String[] args) {
        
         Shape s;
         s = new Rectangle(10,20);
         s.area();
         
         s = new Triangle(20,5);
         s.area();
         
         s = new Circle(10);
         s.area();
         
    }
    
}
