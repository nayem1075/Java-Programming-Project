
package com.mycompany.oop_project.StudentManagementSystem;

public class GraduateStudent extends Student{
    
    @Override
    void display(){
        System.out.println("Graduate Student.");
        System.out.println("Name : "+getName());
        System.out.println("Student Id : "+getId());
        System.out.println("CGPA : "+getCGPA());
    }
    
}
