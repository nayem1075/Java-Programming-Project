
package com.mycompany.statickeyword;


public class CountStudents {
    
    int count = 0;//non Static Variable
    
    CountStudents(){
        count++;
    }
    
    void TotalStudents(){
        
        System.out.println("Total Students = "+count);
    }
    
    public static void main(String[] args) {
        
        //Both are 0 before count.So final output 0.It's related with object.
        CountStudents s1 = new CountStudents();
        s1.TotalStudents();
        
        CountStudents s2 = new CountStudents();
        s2.TotalStudents();
        
        CountStudents s3 = new CountStudents();
        s3.TotalStudents();
        
    }
    
}
