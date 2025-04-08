
package com.mycompany.file;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class WriteFileUserInput {
    
    public static void main(String[] args){
        
      File Folder = new File("Student");  
      Folder.mkdir();
      
      String path = Folder.getAbsolutePath();
      
      File file = new File(path+"/Information.txt");
      
      String id,name;
      try{
          
          Formatter formatter = new Formatter(path+"/Information.txt");
          
          Scanner user = new Scanner(System.in);
          System.out.print("Enter how many students information you need : ");
          int number = user.nextInt();
          user.nextLine();
          
          for(int i=1; i<=number; i++){
              System.out.print("Enter student name : ");
              name = user.nextLine();
              System.out.print("Enter student id : ");
              id = user.nextLine();
              
              formatter.format("%s %s\r\n",name,id);
          }
          
          formatter.close();

      }catch(FileNotFoundException e){
          System.out.println(e);
      }
        
    }
}
