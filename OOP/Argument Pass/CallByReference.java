
package ArgumentPass;


public class CallByReference {
    
    String name;
    
    void change(CallByReference r2){
        
        r2.name = "Nayem";
    }
    
    public static void main(String[] args) {
       
        CallByReference r1 = new CallByReference();
        r1.name = "Rafi";
        System.out.println("Before Calling : "+r1.name);
        
        r1.change(r1);
        System.out.println("After Calling : "+r1.name);
       
    }
    
}
