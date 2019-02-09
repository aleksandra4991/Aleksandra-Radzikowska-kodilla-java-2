package com.kodilla.stream.forum.world;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class WorldTestSuite {


    @Test
    public BigDecimal testGetPeopleQuantity(){
        //Given
        Set<Continent> ourWorld= new HashSet<Continent>();
        Continent Asia=new Continent();
        Continent Europe=new Continent();
        Continent NorthAmerica=new Continent();

        ourWorld.add(Asia);
        ourWorld.add(Europe);
        ourWorld.add(NorthAmerica);

        Country China=new Country(new BigDecimal(1386000000000));
        Country India=new Country(new BigDecimal(1339000000000));
        Country Poland=new Country(new BigDecimal(3797000000));
        Country Italy=new Country(new BigDecimal(6059000000));
        Country USA=new Country(new BigDecimal(3257000000));
        Country Canada=new Country(new BigDecimal(3671000000));

        Asia.add(China);
        Asia.add(India);
        Europe.add(Poland);
        Europe.add(Italy);
        NorthAmerica.add(USA);
        NorthAmerica.add(Canada);

        China.getPeopleQuantity();
        India.getPeopleQuantity();
        Poland.getPeopleQuantity();
        Italy.getPeopleQuantity();
        USA.getPeopleQuantity();
        Canada.getPeopleQuantity();

        //When
        World world=new World();
        BigDecimal peopleOfWorld =world.getPeopleQuantity();

        //Then
        Assert.assertEquals(2741784000000,peopleOfWorld);
    }
}
