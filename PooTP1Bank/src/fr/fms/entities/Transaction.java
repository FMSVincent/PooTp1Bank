package fr.fms.entities;

public class Transaction {
	// Attributs
	private int idTransaction;
	private double amount;
	private String date;
	private String transactionType;
	
	// Constructor
	public Transaction(int idTransaction,double amount,String date,String transactionType) {
		this.idTransaction = idTransaction;
		this.amount = amount;
		this.date = date;
		this.transactionType = transactionType;
	}

	public int getIdTransaction() {
		return idTransaction;
	}

	public void setIdTransaction(int idTransaction) {
		this.idTransaction = idTransaction;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	@Override
	public String toString() {
		return "Transaction [idTransaction=" + idTransaction + ", amount=" + amount + ", date=" + date
				+ ", transactionType=" + transactionType + "] \n";
	}

}
