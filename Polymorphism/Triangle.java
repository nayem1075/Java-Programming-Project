
package com.mycompany.polymorphism;

public class Triangle extends Shape{
    //area
    
    double base, height;
    
    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    
    @Override
    double area(){
        System.out.print("Area for Triangle : ");
        return 0.5 * base * height;
        
    }
    
    
}
