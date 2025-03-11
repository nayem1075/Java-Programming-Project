
package com.mycompany.method;


public class Person {
         
    String name,gender,phone;
    int age;
    
    void displayInformation(){

     System.out.println("Name : "+name);
     System.out.println("Age : "+age);
     System.out.println("Gender : "+gender);
     System.out.println("Phone number : "+phone);
     System.out.println("\n\n");
    }
    
    public static void main(String[] args){
    
   Person person1 = new Person();

   person1.name = "Nayem Uddin";
   person1.age = 20;
   person1.gender = "Male";
   person1.phone = "01830311622";
   person1.displayInformation();
   
   Person person2 = new Person();
   
   person2.name = "Jubair";
   person2.age = 21;
   person2.gender = "Male";
   person2.phone = "01621030657";
   person2.displayInformation();

    }
}
