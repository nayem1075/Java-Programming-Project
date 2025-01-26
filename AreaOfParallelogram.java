
package com.mycompany.area;
import java.util.Scanner;

public class AreaOfParallelogram {

    public static void main(String[] args){
       
        Scanner Input = new Scanner(System.in);
        
        int base, height, area;
        
        System.out.print("Enter Base : ");
        base = Input.nextInt();
        
        System.out.print("Enter Vertical height : ");
        height = Input.nextInt();
        
        area = base*height;
        
        System.out.println("The Area of Parallelogram is : "+area);
       
    }
    
}
