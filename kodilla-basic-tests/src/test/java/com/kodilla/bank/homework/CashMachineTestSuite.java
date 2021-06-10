package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int [] completedTransactions = cashMachine.getCompletedTransactions();
        assertEquals(0, completedTransactions.length);
    }

    @Test
    public void shouldAddThreeElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(3000);
        cashMachine.add(500);
        cashMachine.add(1000);

        int[] completedTransactions = cashMachine.getCompletedTransactions();
        assertEquals(3, completedTransactions.length);
        assertEquals(3000, completedTransactions[0]);
        assertEquals(500, completedTransactions[1]);
        assertEquals(1000, completedTransactions[2]);
    }

    @Test
    public void shouldCalculateAverage() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(1200);
        cashMachine.add(200);
        cashMachine.add(400);

        assertEquals(600, cashMachine.getAverage(), 0.01);
    }

    @Test
    public void shouldReturnAverageEqualsZeroIsArrayIsEmpty() {
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.getAverage(), 0.0001);
    }

    @Test
    public void shouldReturnBalanceOfCashMachine() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(500);
        cashMachine.add(-200);
        assertEquals(300, cashMachine.getSumOfTransactions());
    }

    @Test
    public void shouldReturnNumberOfTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(100);
        cashMachine.add(5000);
        cashMachine.add(-300);
        cashMachine.add(200);
        assertEquals(4, cashMachine.getNumberOfTransactions());
    }
}
