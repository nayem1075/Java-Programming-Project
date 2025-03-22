
package Encapsulation;


public class StudentTest {
    
    public static void main(String[] args){
        
        Student s1 = new Student();
        s1.setName("Nayem Uddin");
        System.out.println("Name : "+s1.getName());
        
        s1.setAge(20);
        System.out.println("Age : "+s1.getAge());
        
        s1.setRoll(24070151);
        System.out.println("Roll : "+s1.getRoll());
        
    }
    
}
