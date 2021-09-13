package com.kodilla.bank.homework;

public class CashMachine {
    private int[] values; // Deklaracja tablicy
    private int size;

    public CashMachine() {
        this.size = 0;
        this.values = new int[0];
    }

    public void add(int value) {



        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
    }

    public int[] getValues() {
        return values;
    }


    public double getCashAmount() {
        double cashAmount = 0;

        for (int i = 0; i < this.values.length; i++) {
            cashAmount += this.values[i];
        }
        return cashAmount;

    }

    public double getAvarage() {
        if (this.values.length == 0) {
            return 0;
        }

        return getCashAmount() / this.values.length;


    }
}
