package com.bridgelabz;

public class Stock {
    private String name;
    private int numShares;
    private double pricePerShare;

    public Stock(String name, int numShares, double pricePerShare) {
        this.name = name;
        this.numShares = numShares;
        this.pricePerShare = pricePerShare;
    }

    public double getValue() {
        return numShares * pricePerShare;
    }

    public String getName() {
        return name;
    }

    public int getNumShares() {
        return numShares;
    }

    public double getPricePerShare() {
        return pricePerShare;
    }
}

