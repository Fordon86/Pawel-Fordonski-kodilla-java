package com.kodilla.good.patterns.challenges.FlightFinder;

import java.util.List;
import java.util.stream.Collectors;

public class FlightPlan {

    private static List<FlightConnection> flightsPlan;

    public FlightPlan(List<FlightConnection> flightsPlan) {
        this.flightsPlan = flightsPlan;
    }

    public List <FlightConnection> findFlightFromAirport (Airport airport){
        return flightsPlan.stream()
                .filter(fc->fc.getAirportFrom().equals(airport))
                .collect(Collectors.toList());
    }

    public List <FlightConnection> findFlightToAirport (Airport airport){
        return flightsPlan.stream()
                .filter(fc->fc.getAirportTo().equals(airport))
                .collect(Collectors.toList());
    }

    public List <FlightConnection> findFlightFromToAirport (Airport airportFrom, Airport airportTo){
        return flightsPlan.stream()
                .filter(fc->fc.getAirportFrom().equals(airportFrom))
                .filter(fc->fc.getAirportTo().equals(airportTo))
                .collect(Collectors.toList());
    }

    public List <FlightConnection> findFlightFromToViaAirport (Airport airportFrom, Airport airportTo, Airport airportVia){
        List<FlightConnection> flightFromVia = findFlightFromToAirport(airportFrom, airportVia);
        List<FlightConnection> flightViaTo = findFlightFromToAirport(airportVia,airportTo);
        flightFromVia.addAll(flightViaTo);
        return flightFromVia;
    }

}
