package Practice;

public abstract class Account {
	
	private final long ACCOUNT_ID;
	private static long nextAccountId = 1000;
	protected double balance;
	
	public Account() {
		this.ACCOUNT_ID = nextAccountId;
		nextAccountId +=5;
		
	}
	
	public double withdraw(double amount) {
		if(amount >= 0) {
			balance -= amount;
		}
		return amount;
		
	}
	
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		}
		
	}
	
	
	public void correctBalance(double amount) {
		this.balance = amount;
		
	}
	
	public long getACCOUNT_ID() {
		return ACCOUNT_ID;
		
	}
	
	public double getBalance() {
		return balance;
		
	}

	@Override
	public String toString() {
		return null;
		
		
	}
	
	

}
