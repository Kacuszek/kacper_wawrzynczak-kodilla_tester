package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuite {
    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachine.csv", numLinesToSkip = 1, delimiter = ':')
    public void shouldReturnTrueWhenSetOfNumbersGeneratedCorrect(int one, int two, int three, int four, int five, int six) throws InvalidNumbersException {
        Set<Integer> validSets = new HashSet<>();
        validSets.add(one);
        validSets.add(two);
        validSets.add(three);
        validSets.add(four);
        validSets.add(five);
        validSets.add(six);

        int counted = gamblingMachine.howManyWins(validSets);
        boolean result = counted >=0 && counted <=6;
        assertTrue(result);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/gamblingMachine.csv",  numLinesToSkip = 1, delimiter = ':')
    public void shouldThrowExceptionWhenLessNumbersThenSix(int one, int two, int three, int four, int five) {
        Set<Integer> invalidSet = new HashSet<>();
        invalidSet.add(one);
        invalidSet.add(two);
        invalidSet.add(three);
        invalidSet.add(four);
        invalidSet.add(five);

        Assertions.assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(invalidSet));
    }


}