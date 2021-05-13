package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightFinder {


    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> flightsDeparture = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()){
            if (flight.getDeparture().equals(departure)){
                flightsDeparture.add(flight);
            }
        }
        return flightsDeparture;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flightsArrival = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()){
            if (flight.getArrival().equals(arrival)){
                flightsArrival.add(flight);

            }
        }
        return flightsArrival;
    }
}
