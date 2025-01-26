
package com.mycompany.logicaloperator;
import java.util.Scanner;


public class Program1 {
    
    public static void main(String[] args){
        
        Scanner User = new Scanner(System.in);
        
        char ch;
        
        System.out.print("Enter any letter : ");
        ch = User.next().charAt(0);
        
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("Vowel");  
        }
        else{
            
            System.out.println("Consonant");
        }
        
    }
    
}
