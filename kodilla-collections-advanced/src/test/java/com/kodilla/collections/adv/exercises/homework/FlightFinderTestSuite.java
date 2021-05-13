package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    @Test
    public void testFindFlightFrom() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        flightFinder.findFlightsFrom("Warszawa");
        List<Flight> result = flightFinder.findFlightsFrom("Warszawa");
        //then
        List<Flight> expetedList = new ArrayList<>();
        expetedList.add(new Flight("Warszawa", "Barcelona"));
        expetedList.add(new Flight("Warszawa", "Londyn"));
        assertEquals(expetedList, result);
    }

    @Test
    public void testFindFlightTo() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        flightFinder.findFlightsTo("Oslo");
        List<Flight> result = flightFinder.findFlightsTo("Oslo");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Londyn", "Oslo"));
        assertEquals(expectedList, result);
    }
}