package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
class ClockTestSuite {

    @Test
    public void shouldCreateDifferentTimes() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        // when
        Clock firstClock = context.getBean(Clock.class);
        Clock secondClock = context.getBean(Clock.class);

        // then
        Assertions.assertEquals(firstClock.getCurrentTime(), secondClock.getCurrentTime());
    }
}