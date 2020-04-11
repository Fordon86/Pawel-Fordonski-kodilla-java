package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.*;

public class Gdansk implements Flight {

    private static Map<Airport, Double> flightsPlan = new HashMap<>();

    @Override

    public Set<Airport> getFlightPlan() {
        return flightsPlan.keySet();
    }

    public Gdansk(){
        flightsPlan.put(new Airport("Wroclaw"), 18.15);
        flightsPlan.put(new Airport("Berlin"), 20.00);
        flightsPlan.put(new Airport("Warszawa"), 21.30);

    }

}

