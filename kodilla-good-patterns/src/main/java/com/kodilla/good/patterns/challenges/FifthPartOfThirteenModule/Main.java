package com.kodilla.good.patterns.challenges.FifthPartOfThirteenModule;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        CombinationOfFlightsFromFewCities.getMap().entrySet()
                .stream()
                .filter(e->e.getKey().hashCode()==1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


    }
}