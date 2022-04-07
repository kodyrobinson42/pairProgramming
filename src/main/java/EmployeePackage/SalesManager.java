package EmployeePackage;

import java.util.ArrayList;

public class SalesManager extends Employee {
    protected double salary;
    protected SalesManager manager;
    protected ArrayList<Employee> employees;

    public double totalSales(){
        return 0.0;
    }
}
