
package com.mycompany.string;


public class Method1 {
    
    public static void main(String[] args){
        
        String firstName = "Nayem";
        String lastName = " Uddin";
        
        String fullName = firstName + lastName;
        System.out.println("Full Name = "+fullName + " "+20);
        
        String name = firstName.concat(lastName);
        System.out.println("Name = "+name);
        
        String upperName = name.toUpperCase();
        System.out.println("Upper Name = "+upperName);
        
        String lowerName =name.toLowerCase();
        System.out.println("Lower Name = "+lowerName);
        
        boolean b = firstName.startsWith("N");
        System.out.println("b = "+b);
        
        boolean last = firstName.endsWith("n");
        System.out.println("last = "+last);
        
        String[] names = {"nayem","ainan","masud","kefayet","fahad"};
        
        for(String i: names){
            System.out.println(i);
        }
        
    }
}
