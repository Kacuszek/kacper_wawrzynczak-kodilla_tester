package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTestSuite {
    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"kacu", "KaCper.98", "K-acper_98"})
    public void shouldReturnTrueIfUserNameIsValid(String text) {
        boolean result = userValidator.validateUsername(text);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"ka", "K@cu&"})
    public void shouldReturnFalseIfUserNameIsNotValid(String text){
        boolean result = userValidator.validateUsername(text);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"kacper.wawrzynczak1@gmail.com", "Kacper@gmail.com"})
    public void shouldReturnTrueIfEmailIsValid(String email){
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"kacper98^&%@onet.pl", "Kacper_+=#@.vp.pl"})
    public void shouldReturnFalseIfEmailIsNotValid(String email){
        boolean result = userValidator.validateEmail(email);
        assertFalse(result);
    }

}