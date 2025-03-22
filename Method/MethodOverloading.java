
package com.mycompany.method;

public class MethodOverloading {
   
    void add(int a, int b){
        System.out.println(a+b);
    }                                                                                      

    void add(double a, double b){
        System.out.println(a+b);
    }
    
    void add (int a, int b, int c){
        System.out.println(a+b+c);
    }
    
    void add(){
        System.out.println("Nothing to add");
    }
    
    public static void main(String[] args) {
        
        MethodOverloading ob = new MethodOverloading();
        ob.add();
        ob.add(10,20);
        ob.add(10.5,2.5);
        ob.add(10,20,30);
    }
    
}

