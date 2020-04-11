package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.*;

public class Berlin implements Flight {

    private static Map<Airport, Double> flightsPlan = new HashMap<>();

    @Override
    public Set<Airport> getFlightPlan() {
        return flightsPlan.keySet();
    }

    public Berlin(){
        flightsPlan.put(new Airport("Wroclaw"), 8.00);
        flightsPlan.put(new Airport("Gdansk"), 9.55);
        flightsPlan.put(new Airport("Warszawa"), 11.00);
    }

}

