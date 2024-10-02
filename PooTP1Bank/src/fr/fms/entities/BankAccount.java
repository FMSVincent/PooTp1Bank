package fr.fms.entities;
import java.util.List;

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
	private int bankAccountId;
	private String accountType;
	private double balance;
	private int customerId;
//	private List<Transaction>;
	
//	constructors
	public BankAccount(int bankAccountId, String accountType, double balance, int customerId) {
		
		this.bankAccountId = bankAccountId;
		this.accountType = accountType;
		this.balance = balance;
		this.customerId = customerId;
		
	}

//	accessors
	public int getBankAccountId() {
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

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	
	
}
