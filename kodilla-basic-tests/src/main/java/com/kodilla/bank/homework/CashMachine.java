package com.kodilla.bank.homework;

public class CashMachine {
    private int[] completedTransactions;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.completedTransactions = new int[0];
    }

    public void add(int transactions) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(completedTransactions, 0, newTab, 0, completedTransactions.length);
        newTab[this.size - 1] = transactions;
        this.completedTransactions = newTab;
    }

    public int[] getCompletedTransactions() {
        return completedTransactions;
    }

    public double getAverage() {
        if (this.completedTransactions.length == 0){
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.completedTransactions.length; i++) {
            sum+=this.completedTransactions[i];
        }
        return sum/this.completedTransactions.length;
    }

    public double getAddAverage() {
        if (this.completedTransactions.length == 0){
            return 0;
        }
        int addTransactionsNumber =0;
        double sum = 0;
        for (int i = 0; i < this.completedTransactions.length; i++) {
            if (this.completedTransactions[i] > 0) {
                sum += this.completedTransactions[i];
                addTransactionsNumber++;
            }
        }
        return sum/addTransactionsNumber;
    }

    public double getMinusAverage() {
        if (this.completedTransactions.length == 0){
            return 0;
        }
        int minusTransactionsNumber = 0;
        double sum = 0;
        for (int i = 0; i < this.completedTransactions.length; i++) {
            if (this.completedTransactions[i] < 0) {
                sum += this.completedTransactions[i];
                minusTransactionsNumber++;
            }
        }
        return sum/minusTransactionsNumber;
    }

    public int getSumOfTransactions() {
        int sum = 0;
        for (int i = 0; i < this.completedTransactions.length; i++) {
            sum += this.completedTransactions[i];
        }
        return sum;
    }

    public int getNumberOfTransactions() {
        return this.completedTransactions.length;
    }
}
