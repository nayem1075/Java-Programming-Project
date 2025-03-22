
package Inheritance;


public class Teacher extends Person {
    //Automatic set
    //String name;
    //int age;
    //displayInformation1();
    
    String qualification;
    
    void displayInformation2(){
        /*
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        
        or call 
     */
        displayInformation1();
        System.out.println("Qualification : "+qualification);
    }
    
    
}
