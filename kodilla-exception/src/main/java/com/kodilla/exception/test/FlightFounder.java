package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFounder {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> mapOfFlights = new HashMap<String, Boolean>();


        for (Map.Entry<String, Boolean> entry : mapOfFlights.entrySet()) {
            if (mapOfFlights.containsKey(flight.getArrivalAirport()) && mapOfFlights.containsValue(true)) {
                System.out.println("Wybrałeś lotnisko docelowe: " + entry.getKey());
            } else {
                throw new RouteNotFoundException();
            }

            }
        }
    }

