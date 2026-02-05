package com.bank;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Main Thread: " + Thread.currentThread().getName());

        // Create the task
        BillingTask task = new BillingTask();

        // Create the Thread object and pass the task
        Thread thread1 = new Thread(task);
        thread1.setName("Background-Billing-Thread");

        // Start the thread
        thread1.start();

        System.out.println("Main Thread continues to run other things...");
    }
}