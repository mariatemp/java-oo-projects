package gr.aueb.cf.ch12PublicAPI.bankapp.model;


import gr.aueb.cf.ch12PublicAPI.Account;

/**
 * Extends the Account class and provides
 * the capability to withdraw amounts greater than the account balance.
 */
public class OverdraftAccount extends Account {
    private double overdraftLimit;

    public OverdraftAccount(int id, String iban, String firstname, String lastname, String ssn, double balance, double overdraftLimit) {
        super(id, iban, firstname, lastname, ssn, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    /**
     * Implements the withdrawal method for managing overdraft.
     *
     * @param amount
     *       the amount of money to be withdrawn.
     * @param ssn
     *        the given ssn.
     * @throws Exception
     */
    @Override
    public void withdraw(double amount, String ssn) throws Exception {
        try {
            if (amount > getBalance() + overdraftLimit) {
                throw new Exception("Insufficient balance error");
            }
            if (!isSsnValid(ssn)) {
                throw new Exception("Bad ssn");
            }
            setBalance(getBalance() - amount);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}