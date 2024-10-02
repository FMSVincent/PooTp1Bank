package fr.fms.entities;
import java.util.List;

public class BankAccountOpening {

//	attributes
	private int bankAccountId;
	private String accountType;
	private double balance;
	private int customerId;
//	private List<Transaction>;
	
//	constructors
	public BankAccountOpening(int bankAccountId, String accountType, double balance, int customerId) {
		
		this.bankAccountId = bankAccountId;
		this.accountType = accountType;
		this.balance = balance;
		this.customerId = customerId;
		
	}

//	accessors
	public int getBankAccountId() {
		return bankAccountId;
	}

	public void setBankAccountId(int bankAccountId) {
		this.bankAccountId = bankAccountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	
	
}
