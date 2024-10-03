package fr.fms.bankjob;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import fr.fms.entities.BankAccount;
import fr.fms.entities.BankCasaDelPaPel;
import fr.fms.entities.Customer;

public class BankJobImpl implements BankIJob {
	
	public void addCustomerToBank(String lastname, String firstname, String email) {
		long customerId = (long) (Math.random() * 100000)+1;
		Customer customer = new Customer(customerId, firstname, lastname, email, null);
		BankCasaDelPaPel.setCustomers(customer);
		System.out.println(BankCasaDelPaPel.getCustomers());
	}
	
	public void addAccountToCustomer(String accountType, double balance, Customer customer, double overDraft) {
			Date toDay = new Date();
		    String formater = new SimpleDateFormat("dd-MM-yy").format(toDay);
		    if(accountType.equalsIgnoreCase("savingAccount")) overDraft = 5.5;
		    long bankAccountId = (long) (Math.random() * 100000)+1;
		    BankAccount bankAccountCustomer = new BankAccount(bankAccountId, accountType, balance, customer.getCustomerId(), formater, overDraft);
		    customer.setListAccount(bankAccountCustomer);
	}
	
	public Customer findCustomer(long customerId) {
		List<Customer> customers = BankCasaDelPaPel.getCustomers();
		for (Customer customer : customers) {
			if (customer.getCustomerId() == customerId) return customer;
		}
		return null;
	}
	
	public void getListBankAccount() {
		for (Customer customer : BankCasaDelPaPel.getCustomers()) {
			if(customer.getListAccount().size() > 0) {
				System.out.println(customer.getListAccount());
				System.out.println(customer);
			}
		}
	}
}
