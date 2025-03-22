
package com.mycompany.array;


public class ForEachLoop {
    
    public static void main(String[] args){
        
        String[] name = new String[4];
        name[0] = "Nayem";
        name[1] = "Ainan";
        name[2] = "Masud";
        name[3] = "Fahad";
       
        for(String x: name){
            System.out.println(x);
        }
        
    }
    
}
