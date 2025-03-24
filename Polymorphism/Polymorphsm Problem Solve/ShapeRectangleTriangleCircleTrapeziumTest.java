
package com.mycompany.polymorphism.ProblemSolve;

public class ShapeRectangleTriangleCircleTrapeziumTest {
    
    public static void main(String[] args) {
        
        Shape[] s = new Shape[5];
        
        s[0] = new Shape();
        s[1] = new Rectangle(10,15);
        s[2] = new Triangle(20,3);
        s[3] =  new Circle(10);
        s[4] = new Trapezium(5,7,10);
        
        for(int i=0; i<5; i++){
            System.out.println(s[i].area());
        }
        
    }
}
