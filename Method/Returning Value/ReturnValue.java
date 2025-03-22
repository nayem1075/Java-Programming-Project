
package Returning_Value;


public class ReturnValue {
   
    int sum (int a, int b){
        
       return a+b; 
    }
    public static void main(String[] args) {
        
        ReturnValue object1 = new ReturnValue();
        System.out.println("Sum of 5+10 = "+object1.sum(5, 10));
        
        ReturnValue object2 = new ReturnValue();
        System.out.println("Sum of 100+20 = "+object2.sum(100, 20));
        
        ReturnValue object3 = new ReturnValue();
        System.out.println("Sum of 15+20 = "+object3.sum(15, 20));
        
        ReturnValue object4 = new ReturnValue();
        System.out.println("Sum of 25+30 = "+object4.sum(25, 30));
        
    }
}
