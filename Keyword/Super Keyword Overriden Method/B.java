
package SuperKeywordOverridenMethod;


public class B extends A{
    
    //display inherit 
    
    @Override
    void display(){
        //For called A class Display Method and print.
        super.display();
        System.out.println("Inside B class");
    }
    
}
