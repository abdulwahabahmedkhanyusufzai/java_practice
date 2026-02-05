package com.bank;

public interface PaymentProcessor {
    // Interfaces only have method signatures (no body {})
    void processPayment(double amount);

    void printReceipt();
}