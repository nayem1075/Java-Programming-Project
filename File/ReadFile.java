
package com.mycompany.file;

import java.util.Scanner;
import java.io.File;

public class ReadFile {

    public static void main(String[] args){
        
        try{
            
            File file = new File("F:\\Java\\OOP\\File\\Student/Information.txt");
            Scanner read = new Scanner(file);
            
            while(read.hasNext()){
                String id = read.next();
                String name = read.next();
                System.out.println("Id : "+id + "  Name : "+name);
            }
            read.close();
        } catch(Exception e){
            System.out.println(e);
        }
        
        
        
    }
}
