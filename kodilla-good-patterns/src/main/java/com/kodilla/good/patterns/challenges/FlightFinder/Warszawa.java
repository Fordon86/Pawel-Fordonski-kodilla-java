package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.*;

public class Warszawa implements Flight {

    private static Map<Airport, Double> flightsPlan = new HashMap<>();

    @Override
    public Set<Airport> getFlightPlan() {
        return flightsPlan.keySet();
    }

    public Warszawa(){
        flightsPlan.put(new Airport("Wroclaw"), 10.05);
        flightsPlan.put(new Airport("Gdansk"), 12.00);
        flightsPlan.put(new Airport("Berlin"), 13.30);
    }

}

