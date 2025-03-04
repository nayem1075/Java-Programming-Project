
package com.mycompany.javaclass;
import java.util.Random;

public class RandomNumberGenerator1 {
    
    public static void main(String[] args){
        
        Random rand = new Random();
        
        int randomNumber = rand.nextInt(10)+1;//Here lowest number 1 and generate (1-10)
        
        System.out.println("Random Number = "+randomNumber);
    }
    
}
