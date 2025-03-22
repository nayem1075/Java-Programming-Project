
package com.mycompany.statickeyword;
//We don't need to create new object
public class StaticVariable {
    
    static String universityName = "USTC";
    
    public static void main(String[] args) {
        
        //No need to create object.It's related to class.StaticVariable ob = new StaticVariable();
        System.out.println("University Name : "+StaticVariable.universityName);
        
        
    }
    
}
