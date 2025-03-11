
package com.mycompany.statickeyword;

public class StaticBlock {
    
    static int id;
    static String name;
    
    //Static Block
    static {
        
        id = 100;
        name = "Nayem Uddin";
    }
    
   static void display(){
        
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
    }
    
    public static void main(String[] args) {
        
        StaticBlock.display();
        
    }
    
    
}
