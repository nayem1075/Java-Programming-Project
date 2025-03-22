
package com.mycompany.oop;

public class Volume {
    
    double height,width,depth;//Instance Variable
    
    Volume(double height, double width, double depth){
        
        //This mean instance variable is not hide
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    
    void display(){
        
        double volume = height*width*depth;
        System.out.println("Volume = "+volume);
    }
    
    public static void main(String[] args){
        
        Volume obj1 = new Volume(10,20,30);
        Volume obj2 = new Volume(40,50,60);
        
        obj1.display();
        obj2.display();
    } 
}
