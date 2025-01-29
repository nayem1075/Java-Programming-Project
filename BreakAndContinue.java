
package com.mycompany.jumpstatement;


public class BreakAndContinue {
    public static void main(String[] args){
        
        for(int i=1; i<=20; i++){
            
            if(i==5){
                continue;
            }
            if(i==15){
                break;
            }
            System.out.println(i);
        }
        
    }
    
}
