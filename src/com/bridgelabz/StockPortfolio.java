package com.bridgelabz;

import java.util.ArrayList;

public class StockPortfolio {
    private ArrayList<Stock> stocks;

    public StockPortfolio() {
        stocks = new ArrayList<>();
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public double getTotalValue() {
        double total = 0;
        for (Stock stock : stocks) {
            total += stock.getValue();
        }
        return total;
    }

    public void printReport() {
        System.out.println("Stock Report:");
        System.out.println("=============");
        for (Stock stock : stocks) {
            System.out.println("Name: " + stock.getName());
            System.out.println("Number of Shares: " + stock.getNumShares());
            System.out.println("Price per Share: " + stock.getPricePerShare());
            System.out.println("Total Value: " + stock.getValue());
            System.out.println();
        }
        System.out.println("Total Portfolio Value: " + getTotalValue());
    }
}
