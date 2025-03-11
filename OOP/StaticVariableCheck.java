
package com.mycompany.statickeyword;

//It's not static variable.We don't need new object for static variable

public class StaticVariableCheck {
    
    String universityName = "USTC";
    
    public static void main(String[] args) {
        
        //Test Static Variable
        
        StaticVariableCheck object1 = new StaticVariableCheck();
        System.out.println("University Name : "+object1.universityName);
        
    }
    
}
