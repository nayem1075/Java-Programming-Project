
package ArgumentPass;

public class CallByValue {
    
    void change(int i){
        i=20;
    }
    
    public static void main(String[] args) {
         
        CallByValue ob = new CallByValue();
        int x = 10;//primitive data
        System.out.println("x before call : "+x);
        
        ob.change(x);
        System.out.println("x After call : "+x);
    }
    
}
