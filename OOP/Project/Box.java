
package com.mycompany.oop;


public class Box {
    
    double height,width,depth;//Instance variable
    
    Box(double h, double w, double d){//Local variable
        
        height = h;
        width = w;
        depth = d;
}
    
    void displayVolume(){
    
       double volume = height * width * depth;
        System.out.println("Volume = "+volume);
    }
    
    public static void main(String[] args) {
        
        Box number1 = new Box(10,10,10);
        number1.displayVolume();
        
        Box number2 = new Box(20,30,10);
        number2.displayVolume();
        
    }
    
    
}
