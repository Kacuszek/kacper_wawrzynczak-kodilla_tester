package com.kodilla.bank.homework;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldCalculateTotalBalance() {
        Bank bank = new Bank ("MRT");
        bank.addDepositCashMachine(100, 0);
        bank.addDepositCashMachine(100, 0);
        bank.addDepositCashMachine(150, 1);
        bank.addDepositCashMachine(50, 1);

        bank.addWithdrawCashMachine(-150, 0);
        bank.addWithdrawCashMachine(-150, 1);

        int balanceCashAmount = bank.getCashAmount();


        assertEquals(100, balanceCashAmount);


    }


    @Test
    public void shouldCalculateAverageWithdrawDepositAndNumberOfOperations() {
        Bank bank = new Bank("MRT");
        bank.addWithdrawCashMachine(-50, 0);
        bank.addWithdrawCashMachine(-150,0);
        bank.addWithdrawCashMachine(-150, 1);
        bank.addWithdrawCashMachine(150, 1);
        bank.addDepositCashMachine(100,0);
        bank.addDepositCashMachine(100,1);


        int withdrawNumber = bank.getNumberOfWithdrawOperations();
        assertEquals(3, withdrawNumber);
        int depositNumber = bank.getNumberOfDepositOperations();
        assertEquals(2, depositNumber);

        double withdrawAverage = bank.getAverageAmountWithdrawOperations();
        assertEquals(-116.66, withdrawAverage, 0.01);
        double depositAverage = bank.getAverageAmountDepositOperations();
        assertEquals(100, depositAverage, 0.01);

    }

}
