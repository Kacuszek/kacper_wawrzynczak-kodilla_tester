package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BMISources {
    static Stream<Arguments> shouldCalculateBMI() {
        return Stream.of(
                Arguments.of(1.93, 48, "Very severely underweight"),
                Arguments.of(1.93, 55, "Severely underweight"),
                Arguments.of(1.93, 62, "Underweight"),
                Arguments.of(1.93, 81, "Normal (healthy weight)"),
                Arguments.of(1.93, 103, "Overweight"),
                Arguments.of(1.93, 121, "Obese Class I (Moderately obese)"),
                Arguments.of(1.93, 139, "Obese Class II (Severely obese)"),
                Arguments.of(1.93, 160, "Obese Class III (Very severely obese)"),
                Arguments.of(1.93, 180, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.93, 217, "Obese Class V (Super Obese)"),
                Arguments.of(1.93, 260, "Obese Class VI (Hyper Obese)")
        );
    }
}
