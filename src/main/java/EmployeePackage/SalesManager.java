package EmployeePackage;

import java.util.ArrayList;

public class SalesManager extends Employee {

    protected double salary = 75000;

    protected SalesManager manager;
    protected ArrayList<Employee> employees;

    public double totalSales(){
        return salary;
    }

    public void addEmployee(Employee newEmployee){
        employees.add(newEmployee);
    }

    public void setEmployees(ArrayList ListEmployees){
        this.employees = ListEmployees;
    }
}
