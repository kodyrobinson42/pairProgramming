package Classes;

import java.util.ArrayList;

public class SalesManager extends Employee {

    public SalesManager(int ID, String name){
        this.employees = new ArrayList<Employee>();
        this.employeeID = ID;
        this.employeeName = name;
    }

    protected double salary = 75000;

    protected SalesManager manager = null;

    ArrayList<Employee> getEmployees() {
        return employees;
    }

    protected ArrayList<Employee> employees;

    public double totalSales(){
        double total = 0;
        for(Employee employee:employees){
            if(employee.getClass().toString() == "Classes.SalesAssociate"){
                total+= 500;
            }
        }
        total+=200* this.customers.size();

        return salary;
    }

    public void addEmployee(Employee newEmployee){
        employees.add(newEmployee);
    }

    public String toString(){
        String result;
        String name = this.employeeName;
        String manager = this.manager.getEmployeeName();
        result = "Sales Manager: "+ name +". Manager: "+manager+". Employees: ";

        for(int i=0;i<employees.size();i++){
            Employee employee = employees.get(i);
            String name1 = employee.employeeName;
            String id1 = String.valueOf(employee.employeeID);
            result += name1+" "+id1;
            if(i<employees.size()-1){
                result += ", ";
            }else{
                result+=". ";
            }
            result += "Total Sales: "+this.totalSales();
        }
        return result;
    }

}
