package com.bank;

public class BillingTask implements Runnable {
    @Override
    public void run() {
        // This code runs in a separate thread
        System.out.println("Billing Task started by: " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000); // Simulate a 3-second task
            System.out.println("Billing Task Completed!");
        } catch (InterruptedException e) {
            System.out.println("Task was interrupted.");
        }
    }
}