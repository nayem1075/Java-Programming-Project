
package com.mycompany.polymorphism;

public class PersonTeacherStudentTest {
    
    public static void main(String[] args){
     
        //Dynamic method dismatch
        Person p = new Person();
        p.display();
        
        p = new Teacher();
        p.display();
        
        p = new Student();
        p.display();
                                                                       
    }
}
