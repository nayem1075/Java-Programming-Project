
package com.mycompany.area;
import java.util.Scanner;


public class AreaOfTrapezium {
    
    public static void main(String[] args){
        
        Scanner Input = new Scanner(System.in);
        
        int a,b,height;
        
        System.out.print("Enter a for area of Trapezium : ");
        a = Input.nextInt();
        
        System.out.print("Enter b for area of Trapezium : ");
        b = Input.nextInt();
        
        System.out.print("Enter vertical height : ");
        height = Input.nextInt();
        
        double area = 0.5 * (a+b) * height;
        
        System.out.println("The Area of Trapezium is : "+area);
        
    }
    
    
}
