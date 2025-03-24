
package com.mycompany.polymorphism.ProblemSolve;

public class Trapezium extends Shape{
    
    double base1,base2,height;
    
    Trapezium (double base1, double base2, double height){
        this.base1 =  base1;
        this.base2 = base2;
        this.height = height;
    }
    
    @Override
    double area(){
        System.out.print("Area of Trapezium : ");
        return 0.5 * (base1 + base2) * height;
    }
    
}
