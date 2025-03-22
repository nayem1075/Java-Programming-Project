
package ArgumentPass;


public class VariableLengthArguments {
    
    //3 dot mean recieved argument of any length .work it kind of array
    void add(int ... num){
        
        int sum=0;
        for(int x : num){
        sum =  sum + x;
    }
        
        System.out.println(sum);
        
    }
    
 
    public static void main(String[] args){
        
        VariableLengthArguments ob = new VariableLengthArguments();
        ob.add(10,20);
        ob.add(10,20,30);
        ob.add(10,20,30,40);
        
    }
    
}
