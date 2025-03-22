
package com.mycompany.array;
import java.util.ArrayList;
import java.util.Collections;

public class SortingAnArray {
    
    public static void main(String[] args){
        
        ArrayList<Integer> number = new ArrayList<>();
        
        number.add(20);
        number.add(-3);
        number.add(80);
        number.add(92);
        number.add(25);
        
        System.out.println("Before Sorting : "+number);
        
       Collections.sort(number);
       
       System.out.println("After Sorting in Ascending Order : "+number);
       
        Collections.sort(number,Collections.reverseOrder());
        
        System.out.println("After Sorting in Descending Order : "+number);
        
    }
}
