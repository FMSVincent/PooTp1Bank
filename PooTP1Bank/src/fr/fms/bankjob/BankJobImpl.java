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
	
	public void addAccountToCustomer(String accountType, double balance, Customer customer) {
			Date toDay = new Date();
		    String formater = new SimpleDateFormat("dd-MM-yy").format(toDay);
		    System.out.println("date : "+ formater);
		    long bankAccountId = (long) (Math.random() * 100000)+1;
		    BankAccount bankAccountCustomer = new BankAccount(bankAccountId, accountType, balance, customer.getCustomerId(), toDay);
		    customer.setListAccount(bankAccountCustomer);
		    System.out.println(customer.getListAccount());
	}
	
	public Customer findCustomer(long customerId) {
		List<Customer> customers = BankCasaDelPaPel.getCustomers();
		Customer isCustomer = null;
		for (Customer customer : customers) {
			if (customer.getCustomerId() == customerId) isCustomer = customer;
		}
		return isCustomer;
	}
}
