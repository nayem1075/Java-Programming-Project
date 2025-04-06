
package toStringMethod;

public class PersonTest {
    
    public static void main(String[] args){
     
        Person p1 =  new Person("Nayem",20);
        Person p2 = new Person("Asif",21);
        
        System.out.println(p1); //Automatically called toStringMethod
        System.out.println(p2);
        
    }
}
