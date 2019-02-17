package com.kodilla.exception.test;

import java.util.HashMap;

public class ApplicationTest {

    public static void main (String[] args){

        Flight flight1=new Flight("Bolonia","Seattle Boeing Fld");
        FlightFounder flightFounder1=new FlightFounder();

        HashMap<String, Boolean> myMapOfFlights = new HashMap<String, Boolean>();
        Flight flight2 = new Flight("Warszawa-Okęcie", "Sakon Nakhon");
        myMapOfFlights.put(flight1.getArrivalAirport(),false);
        myMapOfFlights.put(flight2.getArrivalAirport(), true);


        try {
            flightFounder1.findFlight(flight1);
        }
        catch (RouteNotFoundException e){
                System.out.println("Sorry,there is no possibility to arrive on this aiport from your destination");
            }

            System.out.println("Try another destination");
            }
        }


