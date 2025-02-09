
package com.mycompany.debabratasir;
import java.util.Scanner;

public class BasicInformation {
    
    public static void main(String[] args){
        
        
        Scanner Input = new Scanner(System.in);
        
        String name;
        long Id;
        int Age;
        float Fees;
        char Grade;
        
        System.out.print("Enter Name : ");
        name = Input.nextLine();
        System.out.print("Enter Id : ");
        Id = Input.nextInt();
        System.out.print("Enter Age : ");
        Age = Input.nextInt();
        System.out.print("Enter Fees : ");
        Fees = Input.nextFloat();
        System.out.print("Enter Grade : ");
        Grade = Input.next().charAt(0);
        
        System.out.println("\n\nStudent Name : "+name);
        System.out.println("Id : "+Id);
        System.out.println("Age : "+Age);
        System.out.println("Fees : "+Fees);
        System.out.println("Grade : "+Grade);
        
    }
    
}
