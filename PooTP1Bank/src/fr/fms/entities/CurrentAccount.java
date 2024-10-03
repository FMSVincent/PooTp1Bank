package fr.fms.entities;

public class CurrentAccount extends BankAccount {
    private double overDraft; 

    public CurrentAccount(long bankAccountId, double balance, long customerId, String date, double overDraft) {
        super(bankAccountId, "CurrentAccount", balance, customerId, date);
        this.overDraft = overDraft;
    }

    @Override
    public String toString() {
        return super.toString() + ", Overdraft= " + overDraft;
    }

    public double getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }
}
