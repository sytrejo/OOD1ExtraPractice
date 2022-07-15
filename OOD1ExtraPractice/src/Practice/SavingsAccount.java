package Practice;

public class SavingsAccount extends Account {
	
	private double interestRate;
	
	public SavingsAccount() {
		super();
	}
	
	
	public void addInterest(){
		double interestEarned = (balance * interestRate)/100;
		
		if(interestEarned > 0) {
			this.deposit(interestEarned);
		}
		
	}
	
	public double getInterestRate(){
		return interestRate;
		
	}
	
	public void setInterestRate(double rate){
		this.interestRate = rate;
		
	}
	
	@Override
	public double withdraw(double amount){
		if( 0 > (balance - amount)) {
			return 0;
		} else if((balance -amount) > 0){
			return balance -=amount;
		} else {
			return amount;
		}
	}
	
	

}
