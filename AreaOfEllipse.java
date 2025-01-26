
package com.mycompany.area;
import java.util.Scanner;

public class AreaOfEllipse {
    
    public static void main(String[] args){
        
        Scanner Input = new Scanner(System.in);
        
        int a,b;
        
        System.out.print("Enter a for area of Ellipse : ");
        a = Input.nextInt();
        
        System.out.print("Enter b for area of Ellipse : ");
        b = Input.nextInt();
        
        double area = 3.1416 * a * b;
        
        
  System.out.println("The Area of Ellipse is : "+area);
        
    }
    
}
