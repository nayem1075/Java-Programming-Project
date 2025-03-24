
package com.mycompany.abstraction;

//If we can't override this method then we have to this class declare abstract
public class Rahim extends MobileUser{
    
    //Call method , sendMessage
    
    @Override
    void sendMessage(){
        
        System.out.println("Hi! This is Rahim.");
    }
    
}
