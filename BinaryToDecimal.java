
package com.mycompany.numbersystemconversation;

public class BinaryToDecimal {
    
    public static void main(String[] args){
        
        String binary = "1010";
        
        Integer decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal = "+decimal);
        
        
    }
}
