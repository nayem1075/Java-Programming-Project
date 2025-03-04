
package com.mycompany.javaclass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateClass {
    
    public static void main(String[] args){
        
        Date date = new Date();
        
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        String currentDate = dateFormat.format(date);

        System.out.println("Current Date = "+currentDate);
    }
}
