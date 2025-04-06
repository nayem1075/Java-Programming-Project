package com.mycompany.file;

import java.io.File;

public class CreateFile {

    public static void main(String[] args) {

        File dir = new File("Person");
        dir.mkdir();

        String path = dir.getAbsolutePath();
        System.out.println(path);

        File file1 = new File("student.txt");
        File file2 = new File("Teacher.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Files are created succesfully.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
