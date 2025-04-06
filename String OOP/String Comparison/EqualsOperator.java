
package StringComparison;

public class EqualsOperator {
    
    public static void main(String[] args) {
        
        String password1 = "Nayem622";
        String password2 = "Nayem622";
        String password3 =  new String("Nayem622");
        String password4 =  new String("Nayem622");
        
        //Compares the reference of the object not the value.
        System.out.println(password1 == password2);//True
        System.out.println(password1 == password3);//False for create new object.
        System.out.println(password1 == password4);//False for create new object.
        
        
        
    }
    
}
