
package com.mycompany.area;
import java.util.Scanner;

public class AreaOfCircle {
    
    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);
        
       int radius;
       
       System.out.print("Enter Radius : ");
       radius = Input.nextInt();
       
       double area = 3.1416 * radius * radius;
       
       System.out.println("The Area of Circle is : "+area);
       
    }
    
}
