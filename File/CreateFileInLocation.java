
package com.mycompany.file;

import java.io.File;

public class CreateFileInLocation {
    
    public static void main(String[] args) {
        
        File dir = new File("Text");
        dir.mkdir();
        
        String path = dir.getAbsolutePath();
        
        File file1 =  new File(path+"/student.txt");
        File file2 = new File(path+"/teacher.txt");
        
        try{
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Files are created succesfully");
        }catch(Exception e){
            System.out.println(e);
        }
        
        if(file1.exists()){
            System.out.println("File exists."); 
        }
        
        file2.delete();
        
        if(file2.exists()){
            System.out.println("File exists.");
        }else{
            System.out.println("File doesn't exists.");
        }
        
    }
    
}
