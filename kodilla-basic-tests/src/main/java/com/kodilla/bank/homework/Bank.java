package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;

    public Bank(){
        this.cashMachines = new CashMachine[3];
    }

    public CashMachine[] getCashMachines() {
        return cashMachines;
    }


    public int getSumOfTransactionsFromCashMachines() {
        int sum = 0;
        return sum + cashMachines[0].getSumOfTransactions() + cashMachines[1].getSumOfTransactions() + cashMachines[3].getSumOfTransactions();
    }

    public double getMinusAverageFromCashMachines() {
        double sum = 0;
        return sum + cashMachines[0].getMinusAverage() + cashMachines[1].getMinusAverage() + cashMachines[2].getMinusAverage()/3;
    }

    public double getAddAverageFromCashMachines () {
        double sum = 0;
        return sum + cashMachines[0].getAddAverage() + cashMachines[1].getAddAverage() + cashMachines[2].getAddAverage()/3;
    }



}