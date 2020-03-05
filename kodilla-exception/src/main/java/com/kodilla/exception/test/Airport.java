package com.kodilla.exception.test;

public class Airport {
    public static void main(String[] args) {

        Flight flight1 = new Flight("Poznan", "Berlin");
        Flightfinder flightfinder = new Flightfinder();
        flightfinder.findFlight(flight1);
    }

}
