
package ArgumentPass;

public class VariableLengthArguments1 {
    
    void add(double ... number){
        
        double sum = 0;
        for(double x : number){
            
            sum = sum + x;
            
        }
        
        System.out.println(sum);
        
    }
    
    public static void main(String[] args) {
        
        VariableLengthArguments1 ob = new VariableLengthArguments1();
        ob.add(10.5,25.3);
        ob.add(10.5,25.3,26.65);
        
    }
    
}
