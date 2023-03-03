package account;
import date.date;


public class account {
    private static int Id ;
    private String custmerName;
    private double balance;
    public date data= new date();
       
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
        if(balance>0) {
            this.balance+=balance; 
        }
        
    }
    
    public void withdraw(Double balance) {
        if(balance>this.balance) {
            System.out.println("you don't have enough money ");
        }else {
            this.balance-=balance;
    }
}
    public void accountInfo() {
        System.out.println("name of account : "+custmerName);
        System.out.println("id for account : "+Id);
        System.out.println("blanace is "+balance+"$");
        System.out.format("date of Exp : %d / %d / %d ",data.getDay(),data.getMonth(),data.getYear()+5);

    }
    
    
    
    
    
}
