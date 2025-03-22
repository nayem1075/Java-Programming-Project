
package Returning_Value;


public class ReturningValue {
    
    //return square value
    int square (int value){
        
        return value*value;
        
    }
    
    public static void main(String[] args){
        
        ReturningValue object1 =  new ReturningValue();
        int result =  object1.square(5);
        System.out.println("Square of 5 = "+result);
        
        ReturningValue object2 = new ReturningValue();
        System.out.println("Square of 9 = "+object2.square(9));
        
    }
    
}
