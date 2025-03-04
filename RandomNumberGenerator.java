
package com.mycompany.javaclass;
import java.util.Random;

public class RandomNumberGenerator {
    
    public static void main(String[] args){
        
      Random rand = new Random();  
      
      int randomNumber = rand.nextInt(100);//Mean 100 number (0-99)
      
        System.out.println("Random number = "+randomNumber);
      
    }
}
