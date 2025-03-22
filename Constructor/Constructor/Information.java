
package com.mycompany.constructor;


public class Information {
    String name,gender;
    int age;
    
    //Default Constructor
    Information(){
        System.out.println("No Value");
    }
    //Parametrized Constructor
    Information(String n, String g, int a){
        
        name = n;
        gender = g;
        age = a;
    }
    
    void display(){
        
      System.out.println("Name : "+name);
      System.out.println("Gender : "+gender);
      System.out.println("Age : "+age);
      System.out.println("\n\n");
    }
    
    public static void main(String[] args){
        
        Information number1 = new Information("Nayem","Male",20);
        number1.display();
        
        Information number2 = new Information("Shakib","Male",37);
        number2.display();
        
        Information number3 = new Information();
        number3.display();
        
    }
}
