
package com.mycompany.oop_project.StudentManagementSystem;

public class StudentManagementSystemTest {
    
    public static void main(String[] args) {
        
        Student s;
        
        s = new UndergraduateStudent();
        s.setName("Nayem");
        s.setId(24070151);
        s.setCGPA(3.86);
        s.display();
        
        s = new GraduateStudent();
        s.setName("Akib");
        s.setId(24053501);
        s.setCGPA(3.80);
        s.display();
    }
    
}
