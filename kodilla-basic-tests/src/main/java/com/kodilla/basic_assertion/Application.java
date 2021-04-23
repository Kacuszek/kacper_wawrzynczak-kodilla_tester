package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
            int a = 5;
            int b = 8;
            int sumResult = calculator.sum(a, b);
            int substractResult = calculator.substract(a, b);
            int squared = calculator.squared(a);

            boolean correct = ResultChecker.assertEquals(13, sumResult);
            if (correct) {
                System.out.println("Metoda sum działa poprawnie dla liczb" + a + "i" + b);
            } else {
                System.out.println("Metoda sum nie działa poprawnie dla liczb" + a + "i" + b);
            }

            boolean correctResult = ResultChecker.assertEquals(-3, substractResult);
            if (correctResult) {
                System.out.println("Metoda substract działa poprawnie dla liczb" + a + "i" + b);
            } else {
                System.out.println("Metoda substract nie działa poprawnie dla liczb" + a + "i" + b);
            }

            boolean correctSquared = ResultChecker.assertEquals(25, squared);
            if (correctSquared) {
                System.out.println("Metoda squared działa poprawnie dla liczby" + a);
            } else {
                System.out.println("Metoda squared nie działa poprawnie dla liczby" + a);
            }
    }
}
