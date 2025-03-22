
package com.mycompany.array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListUserInput {
    
    public static void main(String[] args){
        
        Scanner User = new Scanner(System.in);
        
        ArrayList<Integer> number = new ArrayList<>();
        
        System.out.print("Enter how many elements input for ArrayList : ");
        int n = User.nextInt();
        
        System.out.print("Enter ArrayList elements : ");
                
        for(int i=0; i<n; i++){
            
            number.add(User.nextInt()); 
        }
        
        System.out.println("ArrayList = "+number);
        
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("After Descending : "+number);
        

  }
}
