
package com.mycompany.abstraction;

public class FullTimeEmployee extends Employee{
    
    double monthlySalary;
     
    FullTimeEmployee(double monthlySalary){
        this.monthlySalary = monthlySalary;
    }
      
    @Override
    void displaySalary(){
        System.out.println("Full-time Employee");
         System.out.println("Salary : "+calculateSalary());
    }
    
    @Override
    double calculateSalary(){
    
        return monthlySalary;
        
    }
    
}
