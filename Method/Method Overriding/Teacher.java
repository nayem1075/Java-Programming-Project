
package MethodOverriding;

//superclass
public class Teacher extends Person{
    
    String qualification;
    //name,age,displayInformation from Person class
   
    @Override
    void displayInformation(){
        
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Qualification : "+qualification);
        
    }
    
}
