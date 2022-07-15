package Practice;

import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.bankDesignProject.Account;
import com.fdmgroup.bankDesignProject.CheckingAccount;
import com.fdmgroup.bankDesignProject.Company;
import com.fdmgroup.bankDesignProject.Customer;
import com.fdmgroup.bankDesignProject.Person;
import com.fdmgroup.bankDesignProject.SavingsAccount;

public class AccountController{
	
	private List<Customer> customers = new ArrayList<Customer>();
	
	private List<Account> accounts = new ArrayList<Account>();

	private String address;
	private String name;
	private Customer customer;
	private Account account;
	private Account CheckingAccount;
	private Account SavingsAccount;
	
	
	public Customer createCustomer(String name, String address, String type) {
		this.name = name;
		this.address = address;
		
		if(type.equals("person")){
			Customer person = new Person(name, address);
			customers.add(person);
			return person;
		} else if(type.equals("company")) {
			Customer company = new Company(name, address);
			customers.add(company);
			return company;
		} else {
			return customer;
		}
		
		
	}
	
	public Account createAccount(Customer customer, String type) {
		this.customer = customer;
		
		if(type.equals(CheckingAccount)) {
			Account checkingAccount = new CheckingAccount();
			accounts.add(checkingAccount);
			customer.addAccount(checkingAccount);
			return checkingAccount;	
		}else if(type.equals(SavingsAccount)) {
			Account savingsAccount = new SavingsAccount();
			accounts.add(savingsAccount);
			customer.addAccount(savingsAccount);
			return savingsAccount;	
		} else {
			return account;
		}
		
		
	}
	
	public void removeCustomer(Customer customer) {
		this.customer = customer;
		
		for(Customer customer: customers) {
			customer = null;
		}
			
	}
	
	public void removeAccount(Account account) {
		this.account = account;
		
		for(Account account: accounts) {
			this.account = null;
		}
	}
	
	public List<Customer> getCustomers(){
		return customers;
		
	}
	
	public List<Account> getAccounts(){
		return accounts;
		
	}

}
