
package com.mycompany.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class WriteFile {
    
    public static void main(String[] args) {
     
        File Folder = new File("Person");
        Folder.mkdir();
        
        String path = Folder.getAbsolutePath();
        
        File file1 = new File(path+"/Student.txt");
        File file2 = new File(path+"/Teacher.txt");
  
        try{
            
        Formatter formatter1 = new Formatter(path+"/Student.txt");
        formatter1.format("%s %s\r\n","24070151","Nayem Uddin");//\r and \n mean return then new line.
        formatter1.format("%s %s\r\n","24070188","Rahim");
        formatter1.format("%s %s\r\n","24070189","Karim");
        formatter1.close();
        
        Formatter formatter2 = new Formatter(path+"/Teacher.txt");
        formatter2.format("%s %s\r\n","Math","Shamim");
        formatter2.format("%s %s\r\n","Physics","Jabed");
        formatter2.format("%s %s","Chemistry","Jahed");
        formatter2.close();
        
        
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
        
        
        
    }
}
