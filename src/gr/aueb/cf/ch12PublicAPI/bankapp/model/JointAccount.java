package gr.aueb.cf.ch12PublicAPI.bankapp.model;


import gr.aueb.cf.ch12PublicAPI.Account;

/**
 * Extends the Account class and provides
 * the ability to be used by two account holders.
 */
public class JointAccount extends Account {
    private String holder1;
    private String holder2;

    public JointAccount(int id, String iban, String firstname, String lastname, String ssn, double balance, String holder1, String getHolder2) {
        super(id, iban, firstname, lastname, ssn, balance);
        this.holder1 = holder1;
        this.holder2 = holder2;
    }

    public String getHolder1() {
        return holder1;
    }

    public void setHolder1(String holder1) {
        this.holder1 = holder1;
    }

    public String getGetHolder2() {
        return holder2;
    }

    public void setGetHolder2(String getHolder2) {
        this.holder2 = holder2;
    }
}
