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
        for (int i = 0; i < this.cashMachines.length; i ++){
            sum += this.cashMachines[i].getSumOfTransactions();
        }
        return sum;
    }

    public double getMinusAverageFromCashMachines() {
        if (this.cashMachines.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
                sum += this.cashMachines[i].getMinusAverage();
        }
        return sum / this.cashMachines.length;
    }

    public double getAddAverageFromCashMachines() {
            if (this.cashMachines.length == 0) {
                return 0;
            }
        double sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
                sum += this.cashMachines[i].getAddAverage();
        }
        return sum / this.cashMachines.length;
    }



}