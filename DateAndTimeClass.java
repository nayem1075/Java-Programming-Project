
package com.mycompany.javaclass;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeClass {
    
    public static void main(String[] args){
        
     Date date = new Date();
     
     DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
     
     String currentDate = dateFormat.format(date);
     
     System.out.println("Today = "+currentDate);
     
     
     LocalTime time = LocalTime.now();
     
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
     
     String formatted = time.format(formatter);
     
     System.out.println("Now time = "+formatted);
     
        
    }
}
