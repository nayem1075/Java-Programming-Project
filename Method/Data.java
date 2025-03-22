
package com.mycompany.method;


public class Data {
    String name,country,position,gender;
    
    void setInformation(String n, String c, String p, String g){
        
        name = n;
        country = c;
        position = p;
        gender = g;
      }
   
    void displayInformation(){
        
        System.out.println("Player name : "+name);
        System.out.println("Country : "+country);
        System.out.println("Position : "+position);
        System.out.println("Gender : "+gender);
        System.out.println("\n\n");    
    }
    
    public static void main(String[] args){
        
     Data data1 =  new Data();
     
     data1.setInformation("LeonelMessi","Argentina","RWF","Male");
     data1.displayInformation();
     
     Data data2 =  new Data();
     
     data2.setInformation("Alvarez","Argentina","CF","Male");
     data2.displayInformation();
     
     Data data3 =  new Data();
     
     data3.setInformation("Hamza Chowdhury","Bangladesh","DMF","Male");
     data3.displayInformation();
     
    }  
}
