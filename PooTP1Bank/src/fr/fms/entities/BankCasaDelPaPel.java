package fr.fms.entities;

public class BankCasaDelPaPel {
	
	private int bankId;
	private final String bankName = "Casa Del Papel";
	// private List<BankAccount> bankAccountList;
	
	public BankCasaDelPaPel(int bankId) {
		this.bankId = bankId;
	}
	
	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	
	public String getBankName() {
		return bankName;
	}
	

}
