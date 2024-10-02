package fr.fms.entities;

import java.util.List;

public class Customer {
	private int customerId;
	private String firstname;
	private String lastname;
	private String email;
	private List<BankAccount> listAccount;


	public Customer(int customerId, String firstname, String lastname, String email, List<BankAccount> listAccount) {
		this.customerId = customerId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.listAccount = listAccount;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<BankAccount> getListAccount() {
		return listAccount;
	}
	
	public void setListAccount(List<BankAccount> listAccount) {
		this.listAccount = listAccount;
	}
	
}
