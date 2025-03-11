
package com.mycompany.statickeyword;


public class MultipleStaticBlock {
    
    static String universityName;
    static int id;
    
    static{
        
        universityName = "University Of Science And Technology";
        id = 100;
    }
    
    void display(){
        
        System.out.println("University name : "+universityName);
        System.out.println("Id : "+id);
    }
    public static void main(String[] args) {
        
        MultipleStaticBlock object = new MultipleStaticBlock();
        object.display();
    }
    
}
