
package com.mycompany.oop_project.StudentManagementSystem;

public abstract class Student {
    
    private String name;
    private int id;
    private double CGPA;


    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setCGPA(double CGPA){
        this.CGPA = CGPA;
    }
    
    public double getCGPA(){
        return CGPA;
    }

    abstract void display();
 
    
    
}
