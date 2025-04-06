
package com.mycompany.hashmap;
import java.util.HashMap;

public class HashMap2 {
    
    public static void main(String[] args) {
     
        HashMap<String,Integer> Student = new HashMap<String,Integer>();
        
        Student.put("Nayem", 24070151);
        Student.put("Rahim",24070188);
        Student.put("Karim",24070189);
        Student.put("Akib",24070190);
        Student.put("Faisal",24070191);
     
        System.out.println(Student.get("Nayem"));
        System.out.println(Student.get("Rahim"));
        System.out.println(Student.get("Faisal"));
        System.out.println(Student.get("Karim"));
        System.out.println(Student.get("Akib"));
        
    }
}
