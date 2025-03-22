
package Inheritance.SetterGetterMethod;

public class Student extends Person{
    
    //Here access public method not private method
    private int roll;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
    
    void displayInformation2(){
        
        displayInformation1();
        System.out.println("Roll : "+roll);
    }
    
    
    
}
