package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class World {

    private final Set<Continent> world;

    public World(final Set<Continent>world) {
        this.world=world;
    }

    public Set<Continent> getWorld() {
        return new HashSet<Continent>(world);
            }


    public BigDecimal getPeopleQuantity(){
     return   world.stream()
             .flatMap(continent -> continent.getContinent().stream())
             .map(Country::getPeopleQuantity)
             .reduce(BigDecimal.ZERO, (peopleQuantity, current) -> peopleQuantity = peopleQuantity.add(current));

    }
}
