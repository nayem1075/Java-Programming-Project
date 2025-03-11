
package com.mycompany.statickeyword;


public class student {
    
    String name;
    int id;
    static String universityName = "USTC";
    
    //Parameter variable use same name,but we take different to understand
    student(String n, int i){
        
        name = n;
        id = i;  
    }
    void displayInformation(){
        
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("University Name : "+universityName);
        System.out.println("\n");
    }
    
    public static void main(String[] args){
        
        student student1 = new student("Nayem Uddin",24070151);
        student student2 = new student("Kefayet",24070140);
        student student3 = new student("Farhan",24070148);
        
        student1.displayInformation();
        student2.displayInformation();
        student3.displayInformation();
        
    }
    
}
