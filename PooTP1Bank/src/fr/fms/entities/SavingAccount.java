package fr.fms.entities;

public class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(long bankAccountId, double balance, long customerId, String date, double interestRate) {
        super(bankAccountId, "SavingAccount", balance, customerId, date);
        this.interestRate = interestRate;
    }


    @Override
    public String toString() {
        return super.toString() + ", InterestRate= " + interestRate + "\n";
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
