package fr.fms.bankjob;

import java.util.Iterator;
import java.util.List;

import fr.fms.entities.BankAccount;
import fr.fms.entities.BankCasaDelPaPel;
import fr.fms.entities.CurrentAccount;
import fr.fms.entities.Customer;

public class BankJobImpl implements BankIJob {
	
	public void addCustomerToBank(String lastname, String firstname, String email) {
		long customerId = (long) (Math.random() * 100000)+1;
		Customer customer = new Customer(customerId, firstname, lastname, email, null);
		BankCasaDelPaPel.setCustomers(customer);
		System.out.println(BankCasaDelPaPel.getCustomers());
	}
	

	public void addAccountToCustomer(Customer customer, BankAccount bankAccount) {
		    customer.setListAccount(bankAccount);
	}
	
	public boolean makeDeposit(int bankAccountId, int amount) {
		List<Customer> customers = BankCasaDelPaPel.getCustomers();
		for(Customer customer : customers) {
			for(BankAccount account : customer.getListAccount()) {
				if(account.getBankAccountId() == bankAccountId) {
					account.setBalance(account.getBalance() + amount);
					return true;
				}
			}
		}
		return false;
	}
	 

	public boolean makeWithdrawal(int bankAccountId, int amountWithdrawal) {
		List<Customer> customers = BankCasaDelPaPel.getCustomers();
		for(Customer customer : customers) {
			for(BankAccount account : customer.getListAccount()) {
				if(account.getBankAccountId() == bankAccountId) {
					if(account instanceof CurrentAccount) {
						CurrentAccount currentAccount = (CurrentAccount)account;
						currentAccount.getOverDraft();
						if((currentAccount.getBalance()+currentAccount.getOverDraft()) >= amountWithdrawal) {
							account.setBalance(account.getBalance() - amountWithdrawal);
							return true;
						} return false;
					}
					return true;
				}
			}
		} return false;
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
