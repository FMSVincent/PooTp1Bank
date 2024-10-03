package fr.fms.bankjob;

import fr.fms.entities.BankAccount;
import fr.fms.entities.Customer;

public interface BankIJob {
	void addCustomerToBank(String lastname, String firstname, String email);
	void addAccountToCustomer( Customer customer, BankAccount bankAccount);
	Customer findCustomer(long customerId);
	void getListBankAccount();
}
