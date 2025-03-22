
package com.mycompany.statickeyword;


public class VariableTypes {
    
    String name;//Instance variable
    int id;//Instance variable
    static String universityName = "USTC";//Static/class variable
    
    //Constructor
    VariableTypes(String n, int i){
        
    name = n;//n,i Local vaiable
    id = i;
    }
    
    //Method
    void display(){
        
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("University Name : "+universityName);
    }
    
    public static void main(String[] args) {
        
        VariableTypes number1 =  new VariableTypes("Nayem Uddin",24070151);
        number1.display();
        
    }
    
}
