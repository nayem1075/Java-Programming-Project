
package toStringMethod;

public class StudentTest {
    
    public static void main(String[] args) {
        
        Student s1 = new Student("Nayem",20,24070151);
        Student s2 = new Student("Kefayet",21,24070140);
        Student s3 = new Student("Arafat",21,24070131);
    
        System.out.println(s1);//Automaticaly Called toString method
        System.out.println(s2);
        System.out.println(s3);
        
    }
}
