package EmployeePackage;

public abstract class Employee {

    int employeeID;
    String employeeName;
    SalesManager manager;

    public String getEmployeeName(){
        return employeeName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int newID){
        this.employeeID = newID;
    }

    public void setEmployeeName(String newName){
        this.employeeName = newName;
    }

    public void setManager(SalesManager newManager){
        this.manager = newManager;
    }

    public String toString(){
        return "Hi";
    }
}
