
package com.mycompany.statementswitch;
import java.util.Scanner;

public class VowelConsonant {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        char ch;
        System.out.print("Enter any letter : ");
        ch = input.next().charAt(0);
        
        switch(ch){
            
            case 'a':
            case'e':
            case 'i':
            case'o':
            case 'u':
            case 'A':
            case'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
        
    }
    
}
