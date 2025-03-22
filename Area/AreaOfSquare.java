
package com.mycompany.area;
import java.util.Scanner;

public class AreaOfSquare {
    
    public static void main(String[] args) {
        
        Scanner User = new Scanner(System.in);
        
        int a, area;
        
        System.out.print("Enter a for Area of Square : ");
        a = User.nextInt();
        
        area = a*a;
        
        System.out.println("The area of Square is : "+area);
        
        
    }
    
}
