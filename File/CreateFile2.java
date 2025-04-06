
package com.mycompany.file;

import java.io.File;

public class CreateFile2 {
    
    public static void main(String[] args) {
        
        File Folder = new File("Nayem");
        Folder.mkdir();
        
        String path = Folder.getAbsolutePath();
        
        File file1 = new File(path+"/Student.txt");
        File file2 = new File(path+"/Teacher.txt");
        
        
        try{
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Files are created succesfully.");
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
