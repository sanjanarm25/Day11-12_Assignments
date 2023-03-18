package com.bridgelabz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of stocks: ");
        int numStocks = scanner.nextInt();

        StockPortfolio portfolio = new StockPortfolio();

        for (int i = 0; i < numStocks; i++) {
            System.out.println("Enter Stock #" + (i+1) + " details:");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Number of Shares: ");
            int numShares = scanner.nextInt();
            System.out.print("Price per Share: ");
            double pricePerShare = scanner.nextDouble();

            Stock stock = new Stock(name, numShares, pricePerShare);
            portfolio.addStock(stock);
        }

        portfolio.printReport();
    }

}
