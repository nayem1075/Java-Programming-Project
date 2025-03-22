
package com.mycompany.method;

public class Test {
     public static void main(String[] args){
     
/*
     Student student1;//object declare
     student1 = new Student();//object create
*/

    Student student1 = new Student();//object declare and create

    student1.name = "Nayem Uddin";
    student1.age = 20;
    student1.gender = "Male";
    student1.phone = "01830311622";
    
    System.out.println("Name : "+student1.name);
    System.out.println("Age : "+student1.age);
    System.out.println("Gender : "+student1.gender);
    System.out.println("Phone Number : "+student1.phone);
    
    System.out.println();

    Student student2 = new Student();
    
    student2.name = "Jubair";
    student2.age = 20;
    student2.gender = "Male";
    student2.phone = "01621030657";
    
    System.out.println("Name : "+student2.name);
    System.out.println("Age : "+student2.age);
    System.out.println("Gender : "+student2.gender);
    System.out.println("Phone Number : "+student2.phone);
    
        
    }
}
