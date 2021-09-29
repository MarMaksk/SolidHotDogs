package com.company.paymentAndAction;

public abstract class PaymentImpl implements Payment {
    private volatile static double income = 0;
    private volatile static int saledHotdog = 0;

    @Override
    public void showIncome() {
        System.out.println(income);
    }

    @Override
    public void showCountSaledHotdog() {
        System.out.println(saledHotdog);
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public int getSaledHotdog() {
        return saledHotdog;
    }

    public void setSaledHotdog(int saledHotdog) {
        this.saledHotdog = saledHotdog;
    }
}
