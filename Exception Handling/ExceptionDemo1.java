
package com.mycompany.exceptionhandling;

public class ExceptionDemo1 {
    
    public static void main(String[] args) {
        
        //Better right exception if i know this exception
        try{
            int [] a = new int[5];
            a[5] = 10;
        }catch (ArithmeticException e1){
            System.out.println("Exception : "+e1);
        }catch(Exception e2){
            System.out.println("Exception : "+e2);
        }
        finally{
             System.out.println("This is the without Exception error program line");
        }
        
    }
    
}
