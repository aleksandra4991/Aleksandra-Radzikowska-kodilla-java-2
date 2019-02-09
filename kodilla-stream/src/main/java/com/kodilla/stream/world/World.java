package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class World {

    private final Set<Continent> world = new HashSet<Continent>();

    public Set<Continent> getWorld() {
        return new HashSet<Continent>(world);
            }


    public BigDecimal getPeopleQuantity(){
        BigDecimal peopleQuantity = BigDecimal.ZERO;
     return  peopleQuantity = world.stream()
             .flatMap(continent -> continent.getContinent().stream())
             .map(Country::getPeopleQuantity)
             .reduce(BigDecimal.ZERO, (country, current) -> country = country.add(current));

    }
}
