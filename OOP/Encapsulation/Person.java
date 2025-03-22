
package Encapsulation;


public class Person {
   
    //We can't access it others class.Need public method and use set and get method.
   private String name;
   private int age;
   
     //Here we use shortcut Right button - Insert code - select getter and setter
    //Here use any variable
   //Use set method we set value
   public void setName(String name){
       this.name = name;
   }
   
   //Use get method we get value 
   public String getName(){
       return name;
   }
   
   public void setAge(int age){
       this.age = age;
       //If we use int a the we have to write age=a.
   }
   
   public int getAge(){
       return age;
   }
 
    
}
