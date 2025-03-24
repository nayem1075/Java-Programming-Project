
package com.mycompany.polymorphism.ProblemSolve;

public class Circle extends Shape{
    
    double radius;
    
    Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    double area(){
        System.out.print("Area of Circle : ");
        return 3.1416*radius*radius;
    }
    
}
