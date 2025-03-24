
package com.mycompany.abstraction;

public class PartTimeEmployee extends Employee{
    
    double monthlySalary;
    
    PartTimeEmployee(double monthlySalary){
        
        this.monthlySalary = monthlySalary;
        
    }
            
    @Override
        void displaySalary(){
        System.out.println("Part-time Employee");
         System.out.println("Salary : "+calculateSalary());
    }
    
    @Override
    double calculateSalary(){
      return monthlySalary;
        
    }
    
}
