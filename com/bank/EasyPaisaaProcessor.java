package com.bank;

public class EasyPaisaaProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid payment amount: " + amount);
            return;
        }
        System.out.println("Connecting to EasyPaisa API...");
        System.out.println("Processing payment of Rs. " + amount);
    }

    @Override
    public void printReceipt() {
        System.out.println("EasyPaisa Receipt: Payment Successful.");
    }

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.EASYPAISA;
    }
}