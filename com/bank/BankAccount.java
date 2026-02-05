package com.bank;

import java.util.Scanner;

public class BankAccount {
    // 1. Encapsulation: private variables can't be accessed directly from outside
    private String accountHolder;
    protected double balance;

    // 2. Constructor: Runs when you type 'new BankAccount(...)'
    public BankAccount(String name, double initialDeposit) {
        this.accountHolder = name;
        this.balance = initialDeposit;
    }

    // 3. Method to Deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(accountHolder + " deposited: " + amount);
        }
    }

    // 4. Method to Withdraw (with safety check!)
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(accountHolder + " withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds for " + accountHolder);
        }
    }

    @Override
    public String toString() {
        return "BankAccount [accountHolder=" + accountHolder + ", balance=" + balance + "]";
    }

    // 5. Getter: To see the balance safely
    public void displayBalance() {
        System.out.println(accountHolder + "'s Current Balance: " + balance);
    }

    public static void main(String[] args) {
        // Create an account for yourself
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();

        BankAccount myAcc = new BankAccount(name, 5000.0);

        myAcc.displayBalance();
        myAcc.deposit(1500.0);
        myAcc.withdraw(2000.0);
        myAcc.displayBalance();

        // This would fail in Java if you tried: myAcc.balance = 1000000;
        // because the balance is 'private'.
    }
}
