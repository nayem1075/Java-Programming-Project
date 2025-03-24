
package com.mycompany.abstraction;

public class MobileUserRahimKarimTest {
    
    public static void main(String[] args){
        
        MobileUser mu; //Create refference variable
        
        mu = new Rahim();
        mu.call();
        mu.sendMessage();
        
        mu = new Karim();
        mu.call();
        mu.sendMessage(); 
    }
    
}
