package com.mycompany.linkedlist;

import java.util.LinkedList;

public class StudentList {

    public static void main(String[] args) {

        //Student LinkedList
        LinkedList<Student> list = new LinkedList<Student>();
        
        //Student Creation
        Student s1 = new Student("Nayem",24070151,20);
        Student s2 = new Student("Rahim",24010188,21);
        Student s3 = new Student("Karim",24010189,22);
        Student s4 = new Student("Hakim",24010190,22);
        
        //Adding Student to the StudentList
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        
        //Information display
        for(Student s : list){
            
            System.out.println(s.name+"  "+s.id+"  "+s.age);
            
        }
        
    }
}
