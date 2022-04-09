package Classes;

import java.util.ArrayList;

public abstract class Employee {

    int employeeID;
    String employeeName;
    protected SalesManager manager;
    ArrayList<Customer> customers;
    double salary;

    public Employee(){
        this.customers = new ArrayList<Customer>();
    }

    String getEmployeeName(){
        return employeeName;
    }

    int getEmployeeID() {
        return employeeID;
    }

    void setEmployeeID(int newID){
        this.employeeID = newID;
    }

    void setEmployeeName(String newName){
        this.employeeName = newName;
    }

    void setManager(SalesManager newManager){
        this.manager = newManager; //this line isn't working
        newManager.addEmployee(this);
    }

    public abstract String toString();

    SalesManager getManager() {
        return manager;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer customer) {
        this.customers.add(customer);
        customer.setEmployee(this);
    }

    public abstract double totalSales();
}
