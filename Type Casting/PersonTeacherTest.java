
package com.mycompany.typecasting;

public class PersonTeacherTest {
    
    public static void main(String[] args) {
        
        //Upcasting
        Person p = new Teacher();
        p.display();
        
        //Downcasting.Compile time not error but Run time error.
        //So downcasting is not allow.
        Teacher t = (Teacher)new Person();
        t.display();
        
    }
    
}
