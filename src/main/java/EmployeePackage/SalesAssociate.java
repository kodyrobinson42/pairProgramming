package EmployeePackage;

import EmployeePackage.Employee;

public class SalesAssociate extends Employee {
   protected double salary = 35000;
   protected SalesManager manager;

   public SalesManager getSalesManager(){
       return manager;
   }

   public void setManager(SalesManager newManager){
       this.manager = newManager;
   }

    public double totalSales(){
        return salary;
    }
}
