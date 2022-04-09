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
        double totalSales = (this.getCustomers().size() * 200);
        for (int i = 0; i < employees.size(); i++){
            if (employees.get(i) instanceof SalesAssociate){
                totalSales += 500;
            }
        }
        return totalSales;
//        double total = 0;
//        for(Employee employee:employees){
//            if(employee.getClass().toString() == "Classes.SalesAssociate"){
//                total+= 500;
//            }
//        }
//        total+=200* this.customers.size();
//
//        return total;
    }

    public void addEmployee(Employee newEmployee){
        this.employees.add(newEmployee);
    }

    public String toString(){
        String result;
        String name = this.employeeName;
        String manager1;
        if(this.manager!=null) {
            manager1 = this.manager.getEmployeeName();
        }else{
            manager1 = "null";
        }
        result = "Sales Manager: "+ name +". Manager: "+manager1+". Employees: ";

        for(int i=0;i<employees.size();i++){
            Employee employee = employees.get(i);
            String name1 = employee.employeeName;
            String id1 = String.valueOf(employee.employeeID);
            result += name1+" "+id1;
            if(i==employees.size()-1){
                result += ". ";
            }else {
                result += ", ";
            }
        }
        result += "Total Sales: "+this.totalSales();
        return result;
    }

}
