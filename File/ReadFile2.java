
package com.mycompany.file;
import java.io.File;
import java.util.Scanner;

public class ReadFile2 {
    
    public static void main(String[] args) {
        
        try{
            
            File file = new File("F:\\Java\\OOP\\File\\Person/Teacher.txt");
            
            Scanner scan = new Scanner(file);
            
            while(scan.hasNext()){
                
                String course = scan.next();
                String name = scan.next();
                System.out.println("Course : "+course+"  Name : "+name);
            }
            
            scan.close();
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
