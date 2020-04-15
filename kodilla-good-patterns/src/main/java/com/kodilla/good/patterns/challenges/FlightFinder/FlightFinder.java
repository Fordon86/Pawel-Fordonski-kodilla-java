package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    private static Airport wroclaw = new Airport("Wroclaw");
    private static Airport warszawa = new Airport("Warszawa");
    private static Airport gdansk = new Airport("Gdansk");
    private static Airport berlin = new Airport("Berlin");

    public static void main(String[] args) {
        List<FlightConnection> flightsConnectionList = new ArrayList<>();
        flightsConnectionList.add(new FlightConnection(wroclaw, warszawa));
        flightsConnectionList.add(new FlightConnection(gdansk, warszawa));
        flightsConnectionList.add(new FlightConnection(berlin, wroclaw));
        flightsConnectionList.add(new FlightConnection(gdansk, wroclaw));
        flightsConnectionList.add(new FlightConnection(warszawa, wroclaw));
        flightsConnectionList.add(new FlightConnection(wroclaw, berlin));

        FlightPlan flightPlanFrom = new FlightPlan(flightsConnectionList);
        List <FlightConnection> flightsFromWroclaw = flightPlanFrom.findFlightFromAirport(wroclaw);
        System.out.println(flightsFromWroclaw);

        FlightPlan flightPlanTo = new FlightPlan(flightsConnectionList);
        List <FlightConnection> flightsToWroclaw = flightPlanTo.findFlightToAirport(wroclaw);
        System.out.println(flightsToWroclaw);

        FlightPlan flightPlanFromViaTo = new FlightPlan(flightsConnectionList);
        List <FlightConnection> flightsFromViaToWroclaw = flightPlanFromViaTo.findFlightFromToViaAirport(warszawa, berlin, wroclaw);
        System.out.println(flightsFromViaToWroclaw);
    }

}
