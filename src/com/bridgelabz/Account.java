package com.bridgelabz;

public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance < 0.0) {
            System.out.println("Initial balance cannot be negative.");
        }
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        if (amount < 0.0) {
            System.out.println("Credit amount cannot be negative.");
        }
        balance += amount;
    }

    public void debit(double amount) {
        if (amount < 0.0) {
            System.out.println("Debit amount cannot be negative.");
        }
        if (amount > balance) {
            System.out.println("Debit amount exceeded account balance.");
        } else {
            balance -= amount;
        }
    }
}
