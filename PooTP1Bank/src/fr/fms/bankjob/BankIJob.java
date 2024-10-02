package fr.fms.bankjob;

import fr.fms.entities.Customer;

public interface BankIJob {
	void addCustomerToBank(String lastname, String firstname, String email);
	void addAccountToCustomer(String accountType, double balance, Customer customer);
	Customer findCustomer(long customerId);
}
