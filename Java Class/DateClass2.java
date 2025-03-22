
package com.mycompany.javaclass;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DateClass2 {
 
    public static void main(String[] args){
        
       Date date = new Date();
       
       DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
       
       String currentDate = dateFormat.format(date);
       
       System.out.println("Today = "+currentDate);
        
    }
}
