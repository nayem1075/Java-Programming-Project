
package Inheritance.instanceofOperator;

public class DataPersonStudentTest {
    
    public static void main(String[] args) {
        
        Data d = new Data();
        Person p = new Person();
        Student s = new Student();
        
        System.out.println(d instanceof Data);
        System.out.println(d instanceof Person);
        System.out.println(d instanceof Student);
        System.out.println(p instanceof Data);
        System.out.println(p instanceof Person);
        System.out.println(p instanceof Student);
        System.out.println(s instanceof Data);
        System.out.println(s instanceof Person);
        System.out.println(s instanceof Student);
        
        
    }
    
}
