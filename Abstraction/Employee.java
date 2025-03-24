
package com.mycompany.abstraction;

abstract public class Employee {
    
    abstract double calculateSalary();
    
    void displaySalary(){
        System.out.println("Salary : "+calculateSalary());
    }
    
}
