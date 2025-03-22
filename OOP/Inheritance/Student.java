
package Inheritance;

public class Student extends Data{
    
    int roll;
    
    void displayInformation2(){
        
        displayInformation1();
        System.out.println("Roll : "+roll);
        System.out.println("\n");
    }
    
}
