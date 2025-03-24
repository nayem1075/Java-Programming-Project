
package com.mycompany.abstraction;

public class EmployeeFulltimePartTimeEmployeeTest {
    
     public static void main(String[] args) {
        
           
     Employee em;
     em = new FullTimeEmployee(50000);
     em.displaySalary();

     
     em = new PartTimeEmployee(25000);
     em.displaySalary();

  
    }
}
