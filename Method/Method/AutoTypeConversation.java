
package com.mycompany.method;


public class AutoTypeConversation {
    
    void add(double a, double b)
    {
        System.out.println(a+b);
    }    
    
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    
    void add(){
        System.out.println("Nothing to add");
    }
    
    public static void main(String[] args) {
        
        AutoTypeConversation object = new AutoTypeConversation();
        
        object.add();
        object.add(10,5);//Don't find int data type.So auto convert it double 
        object.add(1.5,2.6);
        object.add(5,3,6);
        
        
    }
    
}
