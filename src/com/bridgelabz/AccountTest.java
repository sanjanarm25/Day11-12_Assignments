package com.bridgelabz;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account(100.0);

        // Test debit with amount less than balance
        account.debit(50.0);
        System.out.println("Balance after debit: " + account.getBalance());

        // Test debit with amount equal to balance
        account.debit(50.0);
        System.out.println("Balance after debit: " + account.getBalance());

        // Test debit with amount greater than balance
        account.debit(100.0);
        System.out.println("Balance after debit: " + account.getBalance());
    }
}
