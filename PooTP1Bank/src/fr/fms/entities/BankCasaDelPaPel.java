package fr.fms.entities;

import java.util.ArrayList;
import java.util.List;

public class BankCasaDelPaPel {
	
	private static List<Customer> customers = new ArrayList<Customer>();
	private static String bankName = "Casa Del Papel";
	
	public static String  getbankName() {
		return bankName;
	}

	public static List<Customer> getCustomers() {
		return customers;
	}

	public static void setCustomers(Customer customer) {
		BankCasaDelPaPel.customers.add(customer);
	}
	

}
