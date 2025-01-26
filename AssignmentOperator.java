
package com.mycompany.assignmentoperaotr;
import java.util.Scanner;

public class AssignmentOperaotr {

    public static void main(String[] args){
        
        Scanner Input = new Scanner (System.in);
        
        int x, y, result ;
        
        System.out.print("Enter x : ");
        x = Input.nextInt();
        
        System.out.print("Enter y : ");
        y = Input.nextInt();
        
        result = x+=y;// x=x+y
        System.out.println("x = "+result);
        
        result = x-=y;//x = x-y here the value of x is changed
        System.out.println("x = "+result);
        
        result = x*=y;//x = x*y here the value of x is changed
        System.out.println("x = "+result);
        
        result = x/=y;//x = x/y here the value of x is changed
        System.out.println("x = "+result);
        
        result = x%=y;//x = x%y here the value of x is changed
        System.out.println("x = "+result);
        
        
        
        
    }
   
    
}
