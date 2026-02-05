package com.bank;

// SavingsAccount INHERITS from BankAccount
public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String name, double initialDeposit, double rate) {
        // 'super' calls the constructor of the Parent (BankAccount)
        super(name, initialDeposit);
        this.interestRate = rate;
    }

    // New method only for SavingsAccount
    public void addInterest() {
        double interest = balance * (interestRate / 100);
        deposit(interest);
    }

    public static void main(String[] args) {
        // Create a Savings Account
        SavingsAccount mySavings = new SavingsAccount("Karachi Saver", 10000.0, 5.5);

        // We can use methods from BankAccount!
        mySavings.deposit(2000);

        // And we can use our new method
        mySavings.addInterest();

        mySavings.displayBalance();
    }
}