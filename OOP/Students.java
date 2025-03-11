
package com.mycompany.statickeyword;

public class Students {
  
    static int count = 0;//Static Variable
 
    Students(){
        count++;
    }
    
    void TotalStudents(){
        
        System.out.println("Total Students = "+count);
    }
    
    public static void main(String[] args) {
        
        //Both are increement one after another.It has no connection with object.So it's different for all object.
        Students s1 = new Students();
        s1.TotalStudents();
        
        Students s2 = new Students();
        Students s3 = new Students();
        Students s4 = new Students();
        s4.TotalStudents();
        
    }
    
}
