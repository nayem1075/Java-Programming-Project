
package Inheritance;

public class TeacherAndPersonTest {
    
    public static void main(String[] args){
        
//If We create object using Person class then we need teacher object for qualification.So better we create object using teacher class.
        Teacher t1 =  new Teacher();
        t1.name = "Nayem Uddin";
        t1.age = 20;
        t1.qualification = "Undergraduate Bsc in CSE";
        t1.displayInformation2();
        
        System.out.println("\n\n");
        
        Teacher t2 =  new Teacher();
        t2.name = "Jubair";
        t2.age = 22;
        t2.qualification = "Undergraduate Bsc in CSE";
        t2.displayInformation2();
    }
    
}
