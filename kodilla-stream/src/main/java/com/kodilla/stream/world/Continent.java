package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Continent {

    Set <Country> continent = new HashSet<Country>();

    public Set<Country> getContinent() {
        return continent;
    }


    public void add(Country country){
        continent.add(country);
    }
}
