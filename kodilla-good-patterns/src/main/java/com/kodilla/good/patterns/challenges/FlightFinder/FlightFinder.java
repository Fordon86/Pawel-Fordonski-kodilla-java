package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.*;

public class FlightFinder {

    private static Wroclaw wroclaw = new Wroclaw();
    private static Warszawa warszawa = new Warszawa();
    private static Gdansk gdansk = new Gdansk();
    private static Berlin berlin = new Berlin();

    public static void main(String[] args){

        Set<Airport> wroclawFlightFinder = wroclaw.getFlightPlan();
        Set<Airport> warszawaFlightFinder = warszawa.getFlightPlan();
        Set<Airport> gdanskFlightFinder = gdansk.getFlightPlan();
        Set<Airport> berlinFlightFinder = berlin.getFlightPlan();

        HashSet<Set> airportsSet = new HashSet<Set>();
        airportsSet.add(wroclawFlightFinder);
        airportsSet.add(warszawaFlightFinder);
        airportsSet.add(gdanskFlightFinder);
        airportsSet.add(berlinFlightFinder);

        System.out.println(airportsSet.size());

        System.out.println(airportsSet.contains(warszawaFlightFinder));

        //String result = airportsSet.
    }

}
