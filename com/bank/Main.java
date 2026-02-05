package com.bank;

public class Main {
    public static void main(String[] args) {
        // Imagine this choice comes from a UI or API request
        PaymentMethod userChoice = PaymentMethod.EASYPAISA;
        PaymentProcessor processor = null;

        try {
            System.out.println("--- Starting Transaction ---");

            // 1. Logic to select the processor
            switch (userChoice) {
                case EASYPAISA:
                    processor = new EasyPaisaaProcessor();
                    break;
                case CREDIT_CARD:
                    // If this class isn't created yet, it will fall to default
                    throw new UnsupportedOperationException("Credit Card support coming soon!");
                default:
                    throw new IllegalArgumentException("Unsupported payment method: " + userChoice);
            }

            // 2. Logic to process the payment
            processor.processPayment(1500.0);
            System.out.println("Status: " + processor.getPaymentMethod() + " Success.");

        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            // Catching specific errors you threw
            System.err.println("Configuration Error: " + e.getMessage());

        } catch (Exception e) {
            // Catching any unexpected errors (network, null pointers, etc.)
            System.err.println("Critical System Error: " + e.getMessage());

        } finally {
            // This always runs - perfect for closing connections or logging
            System.out.println("--- Transaction Session Ended ---");
        }
    }
}