package com.kodilla.exception.test;

import java.util.HashMap;

public class Flightfinder {

    public void findFlight (Flight flight) throws RouteNotFoundException {

        HashMap<String,Boolean> flightPlan = new HashMap<>();

        flightPlan.put("Poznan", false);
        flightPlan.put("Berlin", true);
        flightPlan.put("London", true);
        flightPlan.put("Bratislava", true);

        if (flightPlan.containsKey(flight.getArrivalAirport())&& flightPlan.containsKey(flight.getDepartureAirport())) {
            System.out.println("Airport on timetable");
            if (flightPlan.get(flight.getArrivalAirport()) && flightPlan.get(flight.getDepartureAirport())) {
                System.out.println("Plane can start");
            } else {
                System.out.println("Airport is busy");
            }
        }

        else { throw new RouteNotFoundException();

        }
    }
}
