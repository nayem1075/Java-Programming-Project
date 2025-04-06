
package com.mycompany.file;
import java.io.File;

public class CreateFolder {
    
    public static void main(String[] args) {
     
        //Directory/Folder Name
        File dir = new File("C:\\Users\\Nayem\\Desktop\\Nayem");
        dir.mkdir();//Directory will be created
       String dirLocation = dir.getAbsolutePath();
        System.out.println(dirLocation);
        System.out.println(dir.getName());
        
        if(dir.delete()){
            System.out.println(dir.getName()+" Folder has been deleted.");
        }
        

        
    }
}
