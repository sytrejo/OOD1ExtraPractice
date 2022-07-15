package Practice;


public class CheckingAccount extends Account{
	
	private int nextCheckNumber = 1;
	private Customer customer;
	
	public CheckingAccount() {
		super();
	}
	
	
	
	public int getNextCheckNumber() {
		return nextCheckNumber++;
		
	}
	
	

}
