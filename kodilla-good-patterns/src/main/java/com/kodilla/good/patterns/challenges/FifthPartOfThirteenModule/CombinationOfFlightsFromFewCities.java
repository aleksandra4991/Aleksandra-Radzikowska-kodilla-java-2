package com.kodilla.good.patterns.challenges.FifthPartOfThirteenModule;

import java.util.HashMap;

public final class CombinationOfFlightsFromFewCities {

    public static HashMap<FlightFrom,DirectFlightTo> getMap() {
        final HashMap<FlightFrom, DirectFlightTo> whereYouCanFlyFromWhere = new HashMap<>();

        FlightFrom flightFrom1 = new FlightFrom("Warsaw",1);
        FlightFrom flightFrom2 = new FlightFrom("Praha",2);
        FlightFrom flightFrom3 = new FlightFrom("Roma",3);
        FlightFrom flightFrom4 = new FlightFrom("Paris",4);
        FlightFrom flightFrom5 = new FlightFrom("London",5);


        DirectFlightTo directFlightTo1 = new DirectFlightTo("Berlin",1);
        DirectFlightTo directFlightTo2 = new DirectFlightTo("Athens",2);
        DirectFlightTo directFlightTo3 = new DirectFlightTo("Lublana",3);
        DirectFlightTo directFlightTo4 = new DirectFlightTo("Oslo",4);
        DirectFlightTo directFlightTo5 = new DirectFlightTo("Helsinki",5);
        DirectFlightTo directFlightTo6 = new DirectFlightTo("Amsterdam",6);
        DirectFlightTo directFlightTo7 = new DirectFlightTo("Kair",6);
        DirectFlightTo directFlightTo8 = new DirectFlightTo("Vienna",7);
        DirectFlightTo directFlightTo9 = new DirectFlightTo("Bratislava",9);

        whereYouCanFlyFromWhere.put(flightFrom1, directFlightTo1);
        whereYouCanFlyFromWhere.put(flightFrom1, directFlightTo2);
        whereYouCanFlyFromWhere.put(flightFrom1, directFlightTo6);
        whereYouCanFlyFromWhere.put(flightFrom2, directFlightTo3);
        whereYouCanFlyFromWhere.put(flightFrom2, directFlightTo7);
        whereYouCanFlyFromWhere.put(flightFrom3, directFlightTo9);
        whereYouCanFlyFromWhere.put(flightFrom3, directFlightTo8);
        whereYouCanFlyFromWhere.put(flightFrom3, directFlightTo6);
        whereYouCanFlyFromWhere.put(flightFrom4, directFlightTo2);
        whereYouCanFlyFromWhere.put(flightFrom4, directFlightTo5);
        whereYouCanFlyFromWhere.put(flightFrom4, directFlightTo7);
        whereYouCanFlyFromWhere.put(flightFrom5, directFlightTo1);
        whereYouCanFlyFromWhere.put(flightFrom5, directFlightTo9);
        whereYouCanFlyFromWhere.put(flightFrom5, directFlightTo5);
        whereYouCanFlyFromWhere.put(flightFrom5, directFlightTo7);

        return new HashMap<FlightFrom,DirectFlightTo>(whereYouCanFlyFromWhere);

    }
}
