package Practice;

public class Runner {
	
	private Account account;
	private CheckingAccount checkingAccount;
	private SavingsAccount savingsAccount;
	private Customer customer;
	private Customer person;
	private Customer company;
	
	
	public static void main(String[] args) {
		
		//creating a savings account and checking account
		SavingsAccount PersonalSavingsAccount1 = new SavingsAccount();
		SavingsAccount PersonalSavingsAccount2 = new SavingsAccount();
		SavingsAccount CompanySavingsAccount1 = new SavingsAccount();
		SavingsAccount CompanySavingsAccount2 = new SavingsAccount();
		
		CheckingAccount PersonalCheckingAccount1 = new CheckingAccount();
		CheckingAccount PersonalCheckingAccount2 = new CheckingAccount();
		CheckingAccount CompanyCheckingAccount1 = new CheckingAccount();
		CheckingAccount CompanyCheckingAccount2 = new CheckingAccount();
		
		
		
		Person person1 = new Person("Jane", "Kansas");
		Person person2 = new Person("Mark", "Georgia");
		Company company1 = new Company("Coke", "Atlanta");
		Company company2 = new Company("Pepsi", "New York");
		
		company1.addAccount(CompanyCheckingAccount1);
		company1.addAccount(CompanySavingsAccount1);
		company2.addAccount(CompanyCheckingAccount2);
		company2.addAccount(CompanySavingsAccount2);
		
		person1.addAccount(PersonalCheckingAccount1);
		person1.addAccount(PersonalSavingsAccount1);
		person2.addAccount(PersonalCheckingAccount2);
		person2.addAccount(PersonalSavingsAccount2);
		
		System.out.println(person1.getAccounts());
				
		
		
		
	}

}
