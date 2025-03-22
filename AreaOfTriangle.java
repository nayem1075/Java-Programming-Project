
package com.mycompany.area;
import java.util.Scanner;

public class AreaOfTriangle {
    
    public static void main(String[] args){
        
           Scanner User = new Scanner (System.in);
        
        int base, height;
     
        System.out.print("Enter Base : ");
        base = User.nextInt();
        
        System.out.print("Enter Height : ");
        height = User.nextInt();
        
           double area = 0.5 * base * height;

            System.out.println("The Area of Triangle is : "+area);
        
        
    }
    
}
