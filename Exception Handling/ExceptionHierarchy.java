
package com.mycompany.exceptionhandling;

public class ExceptionHierarchy {
    
    public static void main(String[] args){
        
        //For use supermost subclass then we use it at last.
        try {
            int x = 10;
            int y = 0;
            int r = x/y;
            System.out.println("Result : "+r);
        }
        catch(NullPointerException e1){
            System.out.println("Exception : "+e1);
        } catch(Exception e2){
            System.out.println("Exception : "+e2);
        }
        finally {
            System.out.println("This is the without Exception error program line");
        }
        
    }
    
}
