package com.kodilla.good.patterns.challenges.FlightFinder;

public class FlightConnection {

    private Airport airportFrom;
    private Airport airportTo;

    public FlightConnection(Airport airportFrom, Airport airportTo) {
        this.airportFrom = airportFrom;
        this.airportTo = airportTo;
    }

    public Airport getAirportFrom() {
        return airportFrom;
    }

    public Airport getAirportTo() {
        return airportTo;
    }

    @Override
    public String toString() {
        return "FlightConnection{" +
                "airportFrom=" + airportFrom +
                ", airportTo=" + airportTo +
                '}';
    }
}
