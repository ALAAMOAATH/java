package account;

public class Main {
	public static void main(String[] args) {
	    account alaa = new account();
	    alaa.data.setDay(12);
	    alaa.data.setMonth(6);
	    alaa.data.setYear(2022);
	    alaa.addBalance(100000000.0);
	    alaa.setCustmerName("alaa");
	    alaa.accountInfo();
	    
		
	}
}
