
package com.mycompany.anonymousclass;

public class PersonTest {
   
    public static void main(String[] args) {

        Person p = new Person(){
            
            @Override
            void display(){
                System.out.println("Changed value using Anonymous class.");
            }
            
        };
        
        p.display();
        
    }
    
}
