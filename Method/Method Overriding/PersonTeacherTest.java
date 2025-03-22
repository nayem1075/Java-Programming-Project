
package MethodOverriding;

public class PersonTeacherTest {
    
    public static void main(String[] args) {
        
        Teacher t1 = new Teacher();
        
        t1.name = "Nayem Uddin";
        t1.age = 20;
        t1.qualification = "Undergraduate Bsc in Cse";
        
        t1.displayInformation();
        
        System.out.println();
        
        Person p1 = new Person();
        
        p1.name = "Shakib";
        p1.age = 37;
        
        //Person class not set qualification
        
        p1.displayInformation();
        
    }
    
}
