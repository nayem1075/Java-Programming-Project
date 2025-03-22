
package com.mycompany.area;
import java.util.Scanner;

public class AreaOfSector {
    
    public static void main(String[] args){
        
        Scanner Input = new Scanner(System.in);
        
        int radius, AngleInRadius;
        
        System.out.print("Enter Radius : ");
        radius = Input.nextInt();
        
        System.out.print("Enter Ange in Radius : ");
        AngleInRadius = Input.nextInt();
        
        double area = 0.5 * radius * AngleInRadius;
        
        System.out.println("The area of Sector is : "+area);
        
        
    }
    
}
