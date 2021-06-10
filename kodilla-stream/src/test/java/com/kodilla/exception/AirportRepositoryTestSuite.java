package com.kodilla.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirportRepositoryTestSuite {
    @Test
    public void testIsAirportInUse() throws AirportNotFoundExeption {
        // given
        AirportRepository airportRepository = new AirportRepository();
        // when
        boolean isWarsawInUse = airportRepository.isAirportInUse("Warsaw");
        // then
        assertTrue(isWarsawInUse);
    }

    @Test
    public void testIsAirportInUse_withException() {
        //given
        AirportRepository airportRepository = new AirportRepository();
        //when
        //then
        assertThrows(AirportNotFoundExeption.class, () -> airportRepository.isAirportInUse("Vienna"));
    }
}