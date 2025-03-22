
package OverloadingConstructor;


public class Student {
    
    String name,gender;
    int age;
    
    //Overloading Constructor
    
    Student(){
        System.out.println("No Information\n\n");
    }
    
    Student(String n,String g){
        name = n; 
        gender = g;
    }
    
    Student(String n,String g, int a){
        
        name = n;
        gender = g;
        age = a;
    }
    
    void displayInformation(){
        
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Age : "+age);
        System.out.println("\n\n");
     }
    
    public static void main(String[] args){
        
        Student student1 = new Student();
        
        Student student2 = new Student("Nayem", "Male");
        student2.displayInformation();
        
        Student student3 = new Student("Nayem Uddin","male",20);
        student3.displayInformation();  
        
    }
    
}
