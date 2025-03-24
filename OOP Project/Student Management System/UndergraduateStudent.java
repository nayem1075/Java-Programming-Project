
package com.mycompany.oop_project.StudentManagementSystem;

public class UndergraduateStudent extends Student{
    
    @Override
    void display(){
        System.out.println("Undergraduate Student.");
        System.out.println("Name : "+getName());
        System.out.println("Student Id : "+getId());
        System.out.println("CGPA : "+getCGPA());
        System.out.println();
    }
}
