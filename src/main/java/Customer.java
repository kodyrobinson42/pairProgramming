import EmployeePackage.Employee;

public class Customer {

    int customerID;
    String customerName;
    Employee employee;

    public void customer(int id, String name){
        this.customerID = id;
        this.customerName = name;
    }

    public int getCustomerID(){
        return this.customerID;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setCustomerID(int newID){
        this.customerID = newID;
    }

    public void setCustomerName(String newName){
        this.customerName = newName;
    }

    public void setEmployee(Employee newEmployee){
        this.employee = newEmployee;
    }



    public String toString(){
        return "Hi";
    }
}
