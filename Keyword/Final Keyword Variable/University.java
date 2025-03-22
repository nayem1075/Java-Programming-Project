
package FinalKeywordVariable;


public class University {
    
    final String UNIVERSITY_NAME = "USTC";//Constant.Final variable
    final int fees;//Blank final variable
    static final int age;//static blank final variable
    
    //static block fr initialize static blank final variable
    static{
        age = 35;
    }
    
    University(){
        fees = 57000;
    }
    
    void display(){
        System.out.println("University Name : "+UNIVERSITY_NAME);
        System.out.println("Fees : "+fees);
        System.out.println("Age : "+age);
    }
    
}
