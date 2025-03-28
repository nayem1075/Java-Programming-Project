
package com.mycompany.exceptionhandling;

public class ExceptionDemo {
    
    public static void main(String[] args){
        
        //Exception Handling
        try {
        int x = 10;
        int y = 0;
        int result = x/y;//Exception errors.Arithmetic Exception
        System.out.println("Result = "+result);
        
        } catch(ArithmeticException e){
            System.out.println("Exception : "+e);
            }//Here e is a variable like object
        //If we don't know about exception error we use catch(Exception e)
        //If we can't handle error then we use finally block for print others line.
        /* 
        finally {
        System.out.println("Last line of the program");
        }
        */
        System.out.println("Last line of the program");
    }
}
