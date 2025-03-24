
package com.mycompany.abstraction;


public class Circle extends Shape{
    //d1,d2
    
    Circle(double radius){

        super(radius,radius);
        
    }
    
    @Override
    void area(){
        double result = 3.1416*d1*d2;
        System.out.println("Area of Circle : "+result);
    }

}
