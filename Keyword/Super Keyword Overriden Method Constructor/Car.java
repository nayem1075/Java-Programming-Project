
package SuperKeywordOverridenMethodConstructor;


public class Car extends Vehicle {
    //color,weight,attribute();
    int gear;
    
    Car(String c, double w,int g){
        
        super(c,w);//calling the constructor and vehicle class
        gear = g;
    }
    
    @Override
    void attribute(){
     
        super.attribute();
        System.out.println("Gear : "+gear);
    }
    
}
