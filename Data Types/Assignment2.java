
package com.mycompany.datatypes;
import java.util.Scanner;

public class Assignment2 {

public static void main(String[] args){
    
 Scanner User1 = new Scanner(System.in); 
 Scanner User2 = new Scanner(System.in);
 Scanner User3 = new Scanner(System.in);
 Scanner User4 = new Scanner(System.in);
 
 String name,UniversityName,PhoneNumber;
 int roll;
 
 System.out.print("Enter your name : ");
 name = User1.nextLine();
 
 System.out.print("Enter your roll number : ");
 roll = User2.nextInt();
 
 System.out.print("Enter your University Name : ");
 UniversityName = User3.nextLine();
 
 System.out.print("Enter your phone number : ");
 PhoneNumber = User4.nextLine();
 
 System.out.println("Name : "+name);
 System.out.println("Roll number : "+roll);
 System.out.println("University Name : "+UniversityName);
 System.out.println("Phone number : "+PhoneNumber);
 
 
    
}
}
