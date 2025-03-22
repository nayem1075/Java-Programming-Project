
package ThisKeywordMethod;

public class Person {
    
    String name;
    int age;
    
    void message(){
        System.out.println("I am message method");
    }
    
    void display(){
        //write this.message(); or
        message();
        System.out.println("I am display method");
    }
    
}
