package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {
    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warszawa", "Barcelona"));
        flights.add(new Flight("Warszawa", "Londyn"));
        flights.add(new Flight("Londyn", "Oslo"));
        return flights;
    }

}
