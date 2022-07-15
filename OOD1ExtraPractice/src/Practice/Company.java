package Practice;


public class Company extends Customer{
	
	private Account CheckingAccount;
	private Account SavingsAccount;
	
	public Company(String name, String address) {
		super(name, address);
	}

	
	public void chargeAllAccounts(double amount, String type) {
		double totalCost = (amount * 2);
		for(Account account : getAccounts()) {
			
			if(type.equals(CheckingAccount)) {
				CheckingAccount.balance -= amount;		
			}
			
			if(type.equals(SavingsAccount)) {
				SavingsAccount.balance -= totalCost;	
			} 
		}
		
	}


	

}
