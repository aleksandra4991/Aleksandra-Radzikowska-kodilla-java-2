package com.kodilla.good.patterns.challenges.FifthPartOfThirteenModule;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        CombinationOfFlightsFromFewCities.getList()
                .stream()
                .filter(e -> e.getFlightFrom().getCityFlightFrom().equals("Warsaw"))
                .map(directFlightTo -> directFlightTo.getDirectFlightTo().getDirectCityFlightTo())
                .forEach(System.out::println);
    }
}
        /*String flightsToVienna = (String) CombinationOfFlightsFromFewCities.getMap().entrySet()
                .stream()
                .filter(e->e.getValue().getDirectCityFlightTo().equals("Vienna"))
                .map(flightFrom->flightFrom.getKey().getCityFlightFrom())
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(flightsToVienna);
    }
}*/