import account.account;

public class App {
    public static void main(String[] args) throws Exception {
        account alaa = new account();
	    alaa.data.setDay(12);
	    alaa.data.setMonth(6);
	    alaa.data.setYear(2022);
	    alaa.addBalance(100000000.0);
	    alaa.setCustmerName("alaa");
	    alaa.accountInfo();
    }
}
