package fr.fms.entities;

import java.util.Date;

public class BankAccount {

	/* 1Créer l'identifiant de Robert Dupont
	 * Créer l'identifiant de Julie Jolie
	 * définir le découvert et le taux d'intérêt normal
	 * Créer le compte de Robert Dupont
	 * Créer le compte de Julie Jolie
	 * afficher les 2 comptes créés
	 * *****
	 * 6Créer et lister les transactions du compte de Robert
	 * 7Créer et lister les transactions des comptes de Julie *****
	 * 2afficher les soldes des 2 comptes
	 * 3Créer les exceptions
	 * les afficher
	 * 4Créer les comptes inexistants ou les modifier
	 * Afficher les comptes de la banque
	 * 5Afficher les comptes de Julie
	 */
	
	
	
	
//	attributes
	private long bankAccountId;
	private String accountType;
	private double balance;
	private long customerId;
	private String date;
	private double overDraft;
	private double interest;
//	private List<Transaction>;
	
//	constructors
	public BankAccount(long bankAccountId, String accountType, double balance, long customerId2, String date, double overDraft) {
		this.overDraft = overDraft;
		this.bankAccountId = bankAccountId;
		this.accountType = accountType;
		this.balance = balance;
		this.customerId = customerId2;
		this.date = date;
		
	}
	
	@Override
	public String toString() {
		return accountType + "["+"accountId=" + bankAccountId +", creationDate=" + date + ", balance= "+ balance+ "overDraft= "+ overDraft+ "]";
	}

//	accessors
	public long getBankAccountId() {
		return bankAccountId;
	}

	public void setBankAccountId(int bankAccountId) {
		this.bankAccountId = bankAccountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	
	
}
