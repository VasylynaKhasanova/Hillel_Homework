package com.homework6;

public class Credit {
    private final double amount;
    private final double percentagePerPayment;
    private double monthPayment;
    private double quantityPayments;

    public double getAmount() {
        return amount;
    }

    public double getPercentagePerYear() {
        return percentagePerPayment;
    }

    public double getMonthPayment() {
        return monthPayment;
    }

    public void setMonthPayment(double monthPayment) {
        this.monthPayment = monthPayment;
    }

    public double getQuantityPayments() {
        return quantityPayments;
    }

    public void setQuantityPayments(double quantityPayments) {
        this.quantityPayments = quantityPayments;
    }

    public Credit(double amount, double percentagePerPayment, double monthPayment) {
        this.amount = amount;
        this.percentagePerPayment = percentagePerPayment;
        this.monthPayment = monthPayment;
        this.quantityPayments = quantityPayments;
    }

    public Credit(double amount, double percentagePerPayment, double monthPayment, double quantityPayments) {
        this.amount = amount;
        this.percentagePerPayment = percentagePerPayment;
        this.monthPayment = monthPayment;
        this.quantityPayments = quantityPayments;
    }


}
