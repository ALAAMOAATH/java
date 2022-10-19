package account;
import data.Data;

public class account {
    private static int Id ;
    private String custmerName;
    private double balance;
    Data data1 = new Data();
       
    public account() {
        ++Id;
        balance=0;
    }
    
    public void setCustmerName(String custmerName) {
        this.custmerName = custmerName;
    }
    
    
    public static int getId() {
        return Id;
    }

    
    public String getCustmerName() {
        return custmerName;
    }

    public double getBalance() {
        return balance;
    }

    
    public void addBalance(Double balance){
        if(balance<=0) {
            System.out.println("hey check what you have enter");
        }else {
            this.balance+=balance;
        }
        
    }
    
    private void withdraw(Double balance) {
        if(balance>this.balance) {
            System.out.println("you don't have enough money ");
        }else {
            this.balance-=balance;
    }
}
    
    private void accountInfo() {
        System.out.println("name of account : "+custmerName);
        System.out.println("id for account : ");
        System.out.println();
        System.out.println();
        System.out.println();

    }
    
    
    
    
    
}