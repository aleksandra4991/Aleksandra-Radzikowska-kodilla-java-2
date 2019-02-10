package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class Continent {

   private final Set <Country> continent = new HashSet<Country>();


    public Set<Country> getContinent() {
        return new HashSet<>(continent);
    }


    public void add(Country country){
        continent.add(country);
    }
}
