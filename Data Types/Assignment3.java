
package com.mycompany.datatypes;
import java.util.Scanner;
public class Assignment4 {
    
public static void main(String[] args){
    
   
    Scanner Input = new Scanner(System.in);
  
    
    int id;
    String title, price, description,category;
    
    System.out.print("Enter your id : ");
    id = Input.nextInt();
    Input.nextLine();
    
    System.out.print("Enter title : ");
    title = Input.nextLine();
    
    System.out.print("Enter price : ");
    price = Input.nextLine();
    
    System.out.print("Enter description : ");
    description = Input.nextLine();
    
    System.out.print("Enter category : ");
    category = Input.nextLine();
    
    
    System.out.println("\n\nId : "+id);
    System.out.println("Title : "+title);
    System.out.println("Price : "+price);
    System.out.println("Description : "+description);
    System.out.println("Category : "+category);
    
    
}
                     
}


