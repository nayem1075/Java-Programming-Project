
package com.mycompany.constructor;

public class Serial {
    String name,gender;
    int age;
    
    //Constructor and here declare parametrized Constructor
    Serial(String n, String g,int a){
        
        name = n; 
        gender = g; 
        age = a; 
    }
        
  void displayInformation(){
  
      System.out.println("Name : "+name);
      System.out.println("Gender : "+gender);
      System.out.println("Age : "+age);
      System.out.println("\n\n");
     
  }
  
  public static void main(String[] args){
      
      Serial serial1 = new Serial("Nayem Uddin","Male",20);
      serial1.displayInformation();
      
      Serial serial2 = new Serial("Akib","Male",20);
      serial2.displayInformation();
          
     
  }
}
