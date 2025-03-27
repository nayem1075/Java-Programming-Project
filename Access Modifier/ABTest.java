
package Modifier1;


public class ABTest {
    
    public static void main(String[] args) {
        
        //We can't access private method
        /*
         A ob = new A();
         ob.display();
        */
        
        B ob = new B();
        ob.display();
        
        C ob1 = new C();
        ob1.display();
        
    }
    
}
