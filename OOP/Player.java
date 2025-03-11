
package com.mycompany.method;

public class Player {
    
    String name,gender,position,country;
    
    public static void main(String[] args) {
        
        Player player1 = new Player();
        
        player1.name = "Leonel Messi";
        player1.country = "Argentina";
        player1.position = "RWF";
        player1.gender = "Male";
        
        System.out.println("Name : "+player1.name);
        System.out.println("Country : "+player1.country);
        System.out.println("Position : "+player1.position);
        System.out.println("Gender : "+player1.gender);
        
        System.out.println();
        
        Player player2 = new Player();
        
        player2.name = "Mac Allister";
        player2.country = "Argentina";
        player2.position = "CMF";
        player2.gender = "Male";
        
        System.out.println("Name : "+player2.name);
        System.out.println("Country : "+player2.country);
        System.out.println("Position : "+player2.position);
        System.out.println("Gender : "+player2.gender);
        
    }
}
