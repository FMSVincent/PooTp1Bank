package fr.fms.bankjob;

import fr.fms.entities.Customer;

public class BankJobImpl {
	
	public void addCustomerToBank(int id, String lastname, String firstname, String email) {
		Customer customer = new Customer(id, firstname, lastname, email, null);
		
	}
	

}
