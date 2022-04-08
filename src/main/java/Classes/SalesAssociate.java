package Classes;

public class SalesAssociate extends Employee {
   protected double salary = 35000;
   protected SalesManager manager;

   public SalesAssociate(int ID, String name){
       this.employeeID = ID;
       this.employeeName = name;
   }

   public SalesManager getSalesManager(){
       return manager;
   }

  /* public void setManager(SalesManager newManager){
       this.manager = newManager;
   }*///dont think we need this since it isn't different from the employee one

    public double totalSales(){
        return this.customers.size()*100;
    }

    @Override
    public String toString(){
       return "Hi";
    }
}
