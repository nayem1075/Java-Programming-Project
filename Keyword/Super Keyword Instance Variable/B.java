
package SuperKeywordInstanceVariable;


public class B extends A {
    
    //int A = 10
    int x = 5;
    
    void display(){
        System.out.println(x);
        //if variable name same and we want to print superclass Instance variable then
        System.out.println(super.x);
    }
    
}
