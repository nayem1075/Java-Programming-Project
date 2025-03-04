
package com.mycompany.javaclass;

public class RandomNumberGenerator2 {
    
    public static void main(String[] args){
     
        int randomNumber = (int)(Math.random()*100) + 1;//Here +1 mean lowest number 0+1=1 and generate(1-101)
        System.out.println("Random Number = "+randomNumber);
        
        
    }
}
