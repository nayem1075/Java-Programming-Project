
package com.mycompany.abstraction;

//It's not 100% abstract method
public abstract class MobileUser {
    
    void call(){//Non abstract method
        
        System.out.println("Call method.");
        
    }
    
   abstract void sendMessage();//Abstract method
    
}
