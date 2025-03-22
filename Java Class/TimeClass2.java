
package com.mycompany.javaclass;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeClass2 {
    
    public static void main(String[] args){
        
        LocalTime time = LocalTime.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        
        String formatted = time.format(formatter);
        
        System.out.println("Time = "+formatted);
        
        
    }
    
}
