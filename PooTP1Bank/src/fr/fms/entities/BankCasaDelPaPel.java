package fr.fms.entities;

import java.util.ArrayList;
import java.util.List;

public class BankCasaDelPaPel {
	
	private List<Customer> customers = new ArrayList<Customer>();
	private String bankName;
	
	public BankCasaDelPaPel(List<Customer> customers) {
		this.setCustomers(customers);
		this.bankName = "Casa Del Papel";
	}
	
	public String  getbankName() {
		return bankName;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	

}
