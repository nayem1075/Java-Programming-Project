
package com.mycompany.area;
import java.util.Scanner;

public class AreaOfRectangle {
    
    public static void main(String[] args){
        
        Scanner Input = new Scanner(System.in);
        
        int width, height, area;
        
        System.out.print("Enter width : ");
        width = Input.nextInt();
        
        System.out.print("Enter height : ");
        height = Input.nextInt();
        
        area = width * height;
        
        System.out.println("The Area of Rectangle is : "+area);
        
    }
    
}
