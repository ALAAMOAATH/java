import javax.sound.sampled.SourceDataLine;

public class Account {
    private static int Id ;
    public static int getId() {
        return Id;
    }
    public static void setId(int id) {
        Id = id;
    }
    private String custmerName;
    public String getCustmerName() {
        return custmerName;
    }
    public void setCustmerName(String custmerName) {
        this.custmerName = custmerName;
    }
    private double balance;
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }



    

}
