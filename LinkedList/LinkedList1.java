
package com.mycompany.linkedlist;
import java.util.LinkedList;

public class LinkedList1 {
    
    public static void main(String[] args){
        
        LinkedList<String> CountryNames = new LinkedList<String>(); //We can't write size like ArrayList
        
        CountryNames.add("Bangladesh");
        CountryNames.add("Argentina");
        CountryNames.add("Phalistine");
        CountryNames.add("Australia");
        CountryNames.add("Maldives");
        
        System.out.println(CountryNames);
        
    }
    
}
