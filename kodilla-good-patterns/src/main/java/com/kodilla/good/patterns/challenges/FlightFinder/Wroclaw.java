package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.*;

public class Wroclaw implements Flight {

    private static Map<Airport, Double> flightsPlan = new HashMap();

    @Override
    public Set<Airport> getFlightPlan() {
        return flightsPlan.keySet();
    }

    public Wroclaw(){
        flightsPlan.put(new Airport("Warszawa"), 15.50);
        flightsPlan.put(new Airport("Gdansk"), 16.30);
        flightsPlan.put(new Airport("Berlin"), 18.00 );
    }

}

