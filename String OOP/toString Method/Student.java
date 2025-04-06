
package toStringMethod;

public class Student {
    
        String name;
    int age,id;
    
    Student(String name, int age, int id){
        
        this.name = name;
        this.age = age;
        this.id = id;
    }
    
        @Override
    public String toString (){
    
            System.out.println();
        return "Name : "+name +"\nAge : "+age +"\nId : "+id;
        
    }
    
    
}
