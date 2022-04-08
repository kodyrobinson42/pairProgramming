package Classes;

public class Main {
    public static void main(String[] args) {
        SalesManager Serenity = new SalesManager(101, "Serenity");
        SalesManager Jose = new SalesManager(37, "Jose");
        SalesManager Amy = new SalesManager(112, "Amy");
        SalesAssociate David = new SalesAssociate(105,"David");
        SalesAssociate Emily = new SalesAssociate(42, "Emily");
        SalesAssociate George = new SalesAssociate(58,"George");
        SalesAssociate Anne = new SalesAssociate(88, "Anne");
        Customer Jordan = new Customer(14, "Jordan");
        Customer Stephanie = new Customer(22, "Stephanie");
        Customer Gary = new Customer(76, "Gary");
        Customer Lisa = new Customer(43, "Lisa");
        Customer Damien = new Customer(97, "Damien");
        Customer Oliver = new Customer(35, "Oliver");
        Jose.setManager(Serenity);
        Amy.setManager(Serenity);
        David.setManager(Serenity);
        Emily.setManager(Jose);
        Anne.setManager(Amy);
        George.setManager(Amy);
        David.addCustomer(Jordan);
        Emily.addCustomer(Stephanie);
        Emily.addCustomer(Gary);
        Anne.addCustomer(Lisa);
        Amy.addCustomer(Damien);
        George.addCustomer(Oliver);
    }
}
