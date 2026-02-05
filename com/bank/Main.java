package com.bank;

public class Main {
    public static void main(String[] args) {
        // You can point an Interface variable to any implementation
        PaymentProcessor myPayment = new EasyPaisaaProcessor();

        myPayment.processPayment(5000.0);
        myPayment.printReceipt();
    }
}